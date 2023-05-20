print("I will find the greatest of three no.'s using functions")
def great(n1,n2,n3):
    if(n1>n2 and n1>n3):
        print(f"{n1} is Greater no.")
    elif(n2>n3):
        print(f"{n2} is Greater no.")
    else:
        print(f"{n3} is Greater no.")

n1=int(input("Enter the no.1: "))
n2=int(input("Enter the no.2: "))
n3=int(input("Enter the no.3: "))
great(n1,n2,n3)
