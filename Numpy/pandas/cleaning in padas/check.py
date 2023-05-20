import pandas as pd

df = pd.read_csv('cleaning in padas/dates.csv')
print(df.to_string())

df['Date'] = pd.to_datetime(df['Date'])
print(df.to_string())
