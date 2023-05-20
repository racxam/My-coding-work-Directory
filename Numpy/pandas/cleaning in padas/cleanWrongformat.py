print("Here we will se how to clean the wrong formated data")
import numpy as np
import pandas as pd
# To fix this we have two options:
# 1. to remove the the particular row in which coruption has taken place
# 2. to covert the wrong format into the right one

df=pd.read_csv('cleaning in padas/dates.csv')
#coloum of date and row 22 and 26 is croupted
print(df.to_string())

#1. to covernt all into date
# df['Date']=pd.to_datetime(df['Date'])
# print(df.to_string())

# 2. is to delete that cell
df.dropna(subset=['Date'],inplace=True)
df.dropna(subset=['Calories'],inplace=True)
print(df.to_string())