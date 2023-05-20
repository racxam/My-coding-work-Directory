def sumN(n):
    if (n==1):
        return 1
    else:
        return sumN(n-1)+n

val=int(input("Enter the n value of natural no. you want sum of: "))
res=sumN(val)
print("The sum is: ",res)