print("Here we'll learn about the pandas libary's plotting term")
# pandas use plot methods to create graphs

import pandas as pd
import matplotlib.pyplot as plt
df=pd.read_csv("/Users/sumitkumar/Documents/Coding/Numpy/pandas/data.csv")
df.plot()
plt.show()

#Scatter plots in python
# kind='scatter'
# in these type of plots we need to specify the x and y directions,
df1=pd.read_csv("/Users/sumitkumar/Documents/Coding/Numpy/pandas/data.csv")
df.plot(kind='scatter',x='Duration',y='Pulse')
plt.show()

# if you want a histogram then in kind arugument pass [kind="hist] 
#histogram needs only one coloumns
# histograms shows the frequency of each interwal, like saying how many calories we have taken from 1pm to 5pm
df1["Duration"].plot(kind="hist")
plt.show()