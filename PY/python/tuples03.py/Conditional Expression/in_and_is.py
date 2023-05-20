num1=int(input("Enter number 1: "))
num2=int(input("Enter number 2: "))
num3=int(input("Enter number 3: "))
num4=int(input("Enter number 4: "))
print("I'll find the greatest number among those four no's\n\n")

# if(num1>num2 and num1>num3 and num1>num4):
#     print(num1," is greatest no.")
# elif(num2>num3 and num2>num4):
#     print(num2," is the greatest no.")
# elif(num3>num4):
#     print(num3," is the greatest no.")
# else:
#     print(num4," is the greatest no.")

if(num1>num2):
    f1=num1
else:
    f1=num2

if(num3>num4):
    f2=num3
else:
    f2=num4

if(f1>f2):
    print(f1," is the greatest no.")
else:
    print(f2," is the greatest no.")
