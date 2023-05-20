print("=======First way to do slicing=========")
str=input("Enter any string to check if it is palindrome or not\n")
flag=False
if(len(str)%2==0):
    half=int(len(str)/2)

    f_half=str[:half]

    l_half=str[half:len(str)]
    l_half=l_half[::-1]

    if(f_half==l_half):
        flag=True
else:

    half=int(len(str)/2)
    f_half=str[:half]
    l_half=str[half+1:len(str)]
    l_half=l_half[::-1]
    if(f_half==l_half):
        flag=True



if(flag==True):
    print("This string is palindrome")
else:
    print("It's not a palindrome")


print()

# second way to do
#reversed string
print("=========Second way by Slicing========")
str=input("Enter any string to check if it is palindrome or not\n")
revstr=str[::-1]
if(str==revstr):
    print("Yes it is palindrome")
else:
    print("It's not palindrome")

# third way
print("=========Third way by Slicing========")
str=input("Enter any string to check if it is palindrome or not\n")
print("Yes it is palindrome") if (str==str[::-1]) else print("It's not palindrome")
    

    