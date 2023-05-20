import random

def game(you,comp):
    if(you=='s' and comp=='w'):

        return 'y'
    elif(you=='w' and comp=='s'): 

        return 'c'
    if(you=='s' and comp=='g'):

        return 'c'
    elif(you=='g' and comp=='s'):
        
        return 'y'
    if(you=='w' and comp=='g'):
        
        return 'y'
    elif(you=='g' and comp=='w'):
        
        return 'c'
    elif(you==comp):
        return 'draw'
        

print("-----THIS IS SNAKE WATER GUN GAME-----")
print("Computer's Turn: sanke(s), water(w), gun(g) ")
a=random.randint(1,3)
if(a==1):
    comp='s'
elif(a==2):
    comp='w'
elif(a==3):
    comp='g'


you=input("Your turn: snake(s), water(w), gun(g)")
res=game(you,comp)
print("Computer choosen! ! ",comp)
print("you have choosen! ! ",you)
if(res=='y'):
    print("You won!")
elif(res=='c'):
    print("computer won!!")
elif(res=='draw'):
    print("Match draw play again!!")
