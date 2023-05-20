from datetime import datetime
from time import time
import os

print("======Health management System======")
print('''3 Important Instructions.....
1.Go and drink 3.5L (200ml using 18 glasses)
2.After 30 minutes do eye exercise
3.After 45 minutes do physical exercise''')

water=time()
eye=time()
physical=time()
watersecs = 4 
exsecs = 30 * 60
eyessecs = 45 * 60

def logu(msg):
    with open("mylog.txt","a") as f:
        f.write(f"{msg}{datetime.now()}\n")

def drink():

     if (time()-water)> watersecs:
        getw=input("Drink 200ml water.....\n to clear the screen press iloveyou")
        if(getw=='iloveyou'):
            os.system('clear')
            logu("drank water at: ")
            water=time()

def eye():
    while(True):
        if (time() - eye )> eyessecs:
            getw=input("Do eye exercise.....\n to clear the screen press iloveyou")
            if(getw=='iloveyou'):
                os.system('clear')
                logu("eye exercise done at: ")
                eye=time()
def physical():
    while(True):
        if (time() - physical )> exsecs:
            getw=input("Do exercise.....\n to clear the screen press iloveyou")
            if(getw=='iloveyou'):
                os.system('clear')
                logu("physical exercise done at: ")
                physical=time()



drink()
eye()
physical()


        
        




