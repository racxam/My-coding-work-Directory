def fact(n):
    if(n==0 or n==1):
        return 1
    else:
        return n*(fact(n-1))

p=int(input("Enter the no. you want factorial of: "))
result=fact(p)
print(result)
