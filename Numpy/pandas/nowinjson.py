import numpy as np
import pandas as pd
print("big data sets are often stored in JSON files")
print("JSON is a plain text , but it has the format of the object")
print("JSON file use .json extension")
df=pd.read_json('data.json')
print("so as before it will not print the complete file but some rows")
print(df)
print("To print the complete json file we need to convert it to stirng ")
print(df.to_string())
print(f"\n Pyton json files have the same format as the pythind dictonary")


#Now we'll ananlize the data using python
print("\n\n\n")
print("head() method in python returns the header and specified no of rows from starting ")
print(df.head(10))

print("\n\n\n if the head is not specified it will return starting 5 rows")
print(df.head())
print("\n\n\n There is a tail method who works same as head() but from behing")
print(df.tail())

print("\n\n\n")
print(df.tail(7))
print("\n\n\n There is method called info which gives you more infomation about the dataframe" )
print(df.info())

