a= int(input("enter the first number"))
b= input("enter the second number")
try:
    a=int(a)
    b=int(b)
except:
    print("valid input should be there")
try:
    sum=a+b
except:
    print("inputs are wrong")
    sum="nothing"

finally:
    print("Code is executed succesfully","sum is :",sum)

