print("Here we'll learn about pandas correlation ")
# There is a great key aspect of the pandas library that is corelation 
#corelation in python pandas is used for relation between two columns
#corr() function
import pandas as pd
df=pd.read_csv("pandas/corrrle.csv")
print(df.corr())

# corr method ignores the non numeric columns
# corr methos shows a table with number which shows relation between two columns
# all the numbers in corr table varies from -1 to 1 
# 1 is positive corelation 
# -1 is negative corelation 
# 0 is no relation between the two coloums

# What is a good correlation? It depends on the use, but I think it
# is safe to say you have to have at least 0.6 (or -0.6) to call it a good correlation.