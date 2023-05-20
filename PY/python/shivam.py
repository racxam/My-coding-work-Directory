import re


n=int(input("enter"))
result= lambda n : n if(n<=1) else result(n-1) +result(n-2)

print(result)