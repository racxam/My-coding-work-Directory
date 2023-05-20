num=int(input("Enter the number: "))
isprime=True
for i in range(2,int(num/2)+1):
    if(num%i==0):
        isprime=False
        break
    
if(isprime):
    print("Prime")
else:
    print("Not prime")