


num=input("Enter any no.: ")
i=2
num=int(num)

while(i<=int(num/2)):
    if(num==0 or num==1 or num==2 or num==3):
        isprime=True
        break
    elif(num%i==0):
        isprime= False
        break
i=i+1


if(isprime):
    print("It's prime")
else:
    print("It's not prime")