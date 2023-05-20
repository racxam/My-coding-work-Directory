x=int(input("Enter exam score"))

if (x<=100):
    if x>=85:
        print("You got grade A")
    elif x>=75:
         if x<85:
            print("You got grade B")
    elif x>50:
         if x<75:
            print("You got Grade C")
    elif x==50:
        print("You got frade D")
    else:
        print("You are failed!! ")
else:
    print("Grades can't exceed 100")
