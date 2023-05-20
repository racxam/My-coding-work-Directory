from unittest import FunctionTestCase


# Using normal function
# def fiboGenerator(n):
#     a,b=0,1
#     for i in range(n):
#         if(i<=1):
#             print(i,end=" ")
#         else:
#             num=a+b
#             print(num ,end=" ")
#             a=b
#             b=num

def fiboGenerator(n):
    a,b=0,1
    for i in range(n):
        if(i<=1):
            yield i
        else:
            num=a+b
            yield num
            a=b
            b=num


        
    




print("Here i'll print fibonacci series!!")
n=int(input("Guys! please enter the no upto which you want fibonacci series!\n"))
fiboGenerator(n)
for i in fiboGenerator(n):
    print(i)


    