sub1=int(input("Enter marks in sub1: "))

sub2=int(input("Enter marks in sub2: "))
sub3=int(input("Enter marks in sub:3 "))


total=(sub1+sub2+sub3)

if(total>=40):
    if(sub1>=33 and sub2>=33 and sub3>=33):
        print("Passed!!")
    else:
        print("Failed!!")
else:
    print("Failed!!")