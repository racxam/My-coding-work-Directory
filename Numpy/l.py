str=input("Enter any String you want\n")
print("Your entered string is: ",str)
print("Modified string is: ",str[::2])
print("Reversed string is: ",str[::-1])


for i in str:
    print(i)
newstr=""
for i in range(0,len(str),2):
    newstr+=str[i]
print(newstr)