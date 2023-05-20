#Printing patterns in python
# *
# **
# ***
# ****
# *****
from tkinter import Y


n=5
#way1

# for i in range(0,n):
#     print((i+1)*"*")

#way2

# for i in range(0,n):
#     for j in range(0,i+1):
#         print("*",end="")
#     print("\n",end="")

#way3
# def pypart(n):
#     myList = []
#     for i in range(1,n+1):
#         myList.append("*"*i)
#     print("\n".join(myList)) 

# # explantion list will something look like
# # list=['*',"**",'***','****','*****']
# # .join \n will add \n to every index of list, this is how it will work

 
# # Driver Code
# pypart(n)

# ----------------------------------------------------------------------------------
# after 180 degree rotation of the first pattern 
# way1

# for i in range(0,n):
#     print((n-(i+1))*" ",end="")
#     print((i+1)*"*")

#way2

# for i in range(0,n):
#     for j in reversed(range(0,1)):
#         print(((n-(i))-1)*" ",end="")
#         print((i+1)*"*")


# ----------------------------------------------------------------------------------
#  delta trianlge pattern
# for i in range(0,n):
#     for j in range(0,1):
#         print((n-(i+1))*" ",end=" ")
#         print((i+1)*"* ")

