import numpy as np
#using the np.roots function to find the polynomial roots

coeff=[2,3,1]# coefficients of polynomial
print("1st way of finding root Coeff of polynomial")
print(np.roots(coeff))


# second way using np.poly1d
print("2nd way of finding root Coeff of polynomial")

p=np.poly1d([2,3,1])
print(p.r)

#how to evaluate the polynomial equation 
#1.using loop
poly1=[2,3,1]
n=len(poly1)

x=int(input("Enter the value of X\n"))
ans=0
result=0
for i in range(n):
    ans=poly1[i]
    for j in range(n-i-1):
        ans=(ans*x)
    result=result+ans     
print("After evaluating value of x: ",end=" ")
print(result)

#using numpy when x=2
print("Faster way to evaluate polynomial")
poly2=[2,3,1]
print("After evaluating value of x: ",end=" ")
print(result)
evalpoly2= print(np.polyval(poly2,2))