import numpy as np
import pandas as pd
print("We'll learn about Pandas in 10 mint recipie")
s=pd.Series([1,2,3,np.nan,5,6])
print(s)
# its a datetime index
dates=pd.date_range("20130101",periods=6) #2013 01 01 is the date
print(dates)

df=pd.DataFrame(np.random.randn(6,4),index=dates,columns=list("ABCD"))
print(df)
#Data Sets in Pandas are usually multi dimesional tables called Data frames
#Series is like a Column and Dataframes are like a Table
#see how I am creating the table or dataframe

table1={
    "sumit":[1,2,3,4],
    "Srikant":[5,6,7,8],
    "shalini":[0,-5,-3,-100]
}
df1=pd.DataFrame(table1)
print(df1)
# now we'll look at another Data frame
#Pandas use the loc attribute to return one or more specified rows
print("\n will print the row 0")
print(df1.loc[0])# see it's returing the whole row
# print(df1[0]) # this thing is not possible here
print("\n will print the row 0 and 1 now ") # the returned rows are data frames too
print(df1.loc[[0,1]])

a=[17,6,4,43]
s1=pd.Series(a)
print(a)
print(a[3])#it only works in series but for dataframes we have to use the loc attribute to get the desired row
print()
#We can used the named indexs
print("Named Indexes in Pyton Pandas")
tbl1={
    "sumit":[1,2,3,4],
    "mansi":[10,20,30,4],
    "shlaini":[0,-7,-4,10]
    }
datf1=pd.DataFrame(tbl1,index=["m1","m2","m3","m4"])
print(datf1)
# it will now print the the m4 indexed row
print(datf1.loc["m4"])

print()
print("Here we'll read the DATA.CSV file in Python")
#CSV file is a comma seperated file which is used to store large data sets
df2=pd.read_csv('data.csv')
print(df2) # it wil only print first 5 rows and last 5 rows if i am having the large data sets
print("CSV in string format")
print(df2.to_string())# we can here read the complete data file or we can change df.options.display.max_rows=1000 and then read the file
print("Maximum rows are")
print(pd.options.display.max_rows)# these are system's maximum rows
# it means dataframe will only show us max of 60 rows ,but here's the good news we can change this setting
pd.options.display.max_rows=999
print("Now the max rows of the data frame system is")
print(pd.options.display.max_rows)
print(pd.read_csv('data.csv'))# now we can read the complete file
print("The no. of coloumns in data frame system are")
print(pd.options.display.max_columns)