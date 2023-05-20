while(True):
    a=(input("Enter a number: "))
    print("Press 0 to quit the game")
    try: 
        a=int(a)
        c=1/a
        print(c)
        if(a>5):
            print("This no is Greater than 5")
        if(a==0):
            break
        elif(a<=5):
            print("This no isn't Greater than 5")

    except ZeroDivisionError as sumit:
        print(f"you are doing something malicious so this is showing this error : {sumit}")
    except ValueError as v:
        print("It's a value error")




print("Thanks for playing this game")