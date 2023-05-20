# wrong data can not be just empty or wrong format it can be just wrong
# wrong data like someone has written 1999 instead of 1.999,someone can spot the wrong data be seeing the data
# as it hasn't come as expected so we can spot it

# how to fix this
#1. replacing the value
import pandas as pd
df= pd.read_csv('cleaning in padas/newdata.csv')
# df.loc[7,'Duration']=45
# print(df.to_string())

#for small data sets we can do that one by one , but for larger value we need to set the boundaries
# for x in df.index:
#     if df.loc[x,"Duration"]>120:
#         df.loc[x,"Duration"]=120
# print(df.to_string())

#droping the values
for x in df.index:
    if df.loc[x,"Duration"]>120:
        df.drop(x,inplace=True)
print(df.to_string())
#to remove duplicates rows
# we do this
print(df.duplicated())
df.drop_duplicates(inplace=True)
print(df.to_string())
print(df.duplicated())
