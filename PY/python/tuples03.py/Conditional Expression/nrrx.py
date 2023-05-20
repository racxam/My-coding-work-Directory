total=int (input("Enter your total marks!!"))
if(total>=90 and total<=100): 
    print("Ex")
elif(total<90 and total>=80):
    print("A")
elif(total<80 and total>=70):
    print("B")
elif(total<70 and total>=60):
    print("C")
elif(total<60 and total>=50):
    print("D")
elif(total>100):
    print("input greater than 100 is not allowed!!")
else:
    print("F")