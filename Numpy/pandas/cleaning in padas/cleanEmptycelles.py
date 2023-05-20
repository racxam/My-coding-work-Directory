print("Here in Pandas we'll learn about the cleaning of the Data")
import pandas as pd
print('''First we'll learn about what it means to clean the data in python , 
         cleaning of the data in python means fixing the Bad data or inconsistant data which comes for whatever reasons
         Bad data could be:
         1.Empty cells
         2.Data in wrong format
         3.Wrong data
         4.Duplicate data


         ''')

print("\n\n See before analysising the data we need to clean the data bcz an inconsistnet data or bad data could cause bad results  ")
print("first we'll learn how to deal with empty cells")
print("one way to deal with the empty cells is to remove the rows that containes the empty cells")
print("This is a good way when we have lots of data so removing some rows doesn't impact too much")

# so here's how we can do that
df=pd.read_csv('data.csv')
# new_df=df.dropna()
# print(df.to_string())
print("dropna will not change the orginal one but it will give us the new dataframe without empty cells")
print('''and if  you want to change the orginal set then set inplace=Truen here''')
# df.dropna(inplace=True)
# print(df)

#There is a way 2 which can also be used to clean the empty rows
# we have to refill the data
# df.fillna(1300000,inplace=True)
# print(df.to_string())

# This might not what we want because we dnt have control over the filling of the data
# so we have to fill the data according to the coloums , so here's how we can do it
# df["Calories"].fillna(16666666,inplace=True)
# print(df.to_string())


# REPLACE USING MEAN MEDIAN AND MODE
#pandas use mean median and mode of a particular column 
# x=df["Calories"].mean()#mean
# df["Calories"].fillna(x,inplace=True)
# print(x)
# print(df.to_string())


#uisng median
# x=df["Calories"].median()#mean
# df["Calories"].fillna(x,inplace=True)
# print(x)
# print(df.to_string())

#using mode
x=df["Calories"].mode()[0]#mean
df["Calories"].fillna(x,inplace=True)
print(x)
print(df.to_string())
