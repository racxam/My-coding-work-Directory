import pandas
print("Here we'll learn about the pandas")
print("the Following funciton is used to print the version of the Pandas Library")
print(pandas.__version__)
mydataset={
    'cars':["Maruti","Bmw","ferrari"],
    'passings':[3,7,2]
}
myvar=pandas.DataFrame(mydataset)
print(myvar)
print()
#Series in Pandas
# A series in Pandas is like a coloum in Table
# One D array holding any data type
a=[4,5,6]
mynewvar=pandas.Series(a)
print(mynewvar)
print("The first value os the mynewvar is:",mynewvar[0])

print("\n Pandas is a great python library which can create own labels instead of usual index auto generated\n")

b=[63,69,66,33]
pvar=pandas.Series(b,index=["first","second","third","fourth"])
print(pvar)
print(pvar["fourth"])

print("\nWe can also generate a key:value pair using Series of pandas")
dict1={"es":'i',"livi":'love',"do":'you'}
dictvar=pandas.Series(dict1)
print(dictvar)
print("\nThe keys of the Dictionary will become the labels of the Pandas Series")

dict2var=pandas.Series(dict1,index=["es",'livi'])
print("now i'm printing the dictonary")
print(dict2var)

#data frame in python pandas
print("Here we will get to know about the python data frames in pandas library")
data={
    "calaories":[420,380,390],
    "duration":[50,40,45]
}
yesvar=pandas.DataFrame(data)
print(yesvar)