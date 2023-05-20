# def fibo(a):
#     if(a==0 or a==1):
#         return a
#     elif(a>1):
#         return fibo(a-1)+fibo(a-2)
    

# num=int(input("Enter the index you want fibonacci index of: "))

# ans=fibo(num)

# print(f"The term at postion{num} is {ans}")

def fibo(a):
    if(a==0 ):
        return a

    if(a==1):
        return a

    
    elif(a>1):
       c=fibo(a-2)+fibo(a-1)
       return c

        
        
    

fibo(3)
