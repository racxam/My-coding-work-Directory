n=int(input("Enter the no. you want delta pattern of:\n"))

print("Printing Delta patter>>>>>>>>>>>>\n\n")

for i in range(0,n):
    for j in range(0,1):
        print((n-(i+1))*" ",end=" ")
        print((i+1)*"* ")
