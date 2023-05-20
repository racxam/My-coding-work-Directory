import pyttsx3
import datetime
import speech_recognition as sr
import wikipedia
import webbrowser as web
import subprocess
import os
import pywhatkit as kt
from playsound import playsound



engine= pyttsx3.init('nsss')
voices=engine.getProperty('voices')
engine.setProperty('voice',voices[40].id)



def speak(audio):
    engine.say(audio)
    engine.runAndWait()

def listenAndthenWrite():
    # This function use microphone to listen then sound and then writes #it or we can say it retuens then a string..

    r= sr.Recognizer()
    with sr.Microphone() as source:
        playsound('/Users/sumitkumar/Documents/Iron Man Jarvis/openingsound.mp3')
        print("Listening.............")


        r.pause_threshold = 1
        audio=r.listen(source)
    

    try:
        print("Recognising........")
        query= r.recognize_google(audio,language='en-in')
        print(f"User said: {query}\n")
    except Exception as e:
        print("Speak Again!!!...")
        return "None"
   
    return query

       


def wishUs():
    hour=int(datetime.datetime.now().hour)
    if(hour>0 and hour<12):
        speak("Naamaaskaaraam,Summitt jii Good Morning!")
        speak("I am Jinny, how may i help you  ")
    elif(hour>=12 and hour<=16):
        speak("Naamaaskaaraam,Sumitt jii Good Afternoon!")
        speak("I am Jinny, how may i help you")
  
    elif(hour>16 and hour<=22):
        speak("Naamaaskaaraam,Summitt jii Good Evening!")
        speak("I am Jinny, how may i help you")
    else:
        speak("Namaskaarm,Summitt jii Good Night Sweet Dreams!")
        speak("I am Jinny, how may i help you")

        


#Here I'm Starting............................



while(1):
     code=listenAndthenWrite().lower() 
     if("twinkle twinkle" in code or 'twinkle' in code) :
         print("Opening!!")
         break
     else:
        continue
        
        

wishUs()
while(True):
    query=listenAndthenWrite().lower()
    #Logic for exiquting tasks based on query
    if 'wikipedia' in query:
        speak("Googling in wikipedia")
        query=query.replace("wikipedia","")
        results= wikipedia.summary(query,sentences=2)
        speak("According to wikipedia")
        print(results)  
        speak(results)


    elif ('open youtube' in query or 'open you tube' in query):
        
        web.get('safari').open_new("www.youtube.com")


    elif ('open facebook' in query or 'open face book' in query):
         web.get('safari').open_new("www.facebook.com")

    elif ('open instagram' in query or 'open insta gram' in query):
        
        web.get('safari').open_new("www.instagram.com")

    elif ('open gmail' in query or 'open google mail' in query):
        
        web.get('safari').open_new("www.Gmail.com")


    elif ('open outlook' in query or 'open microsoft outlook' in query):
        
        web.get('safari').open_new("www.outlook.com")


    elif ("open sandeep maheswari site " in query or 'open s m tv ' in query):
        web.get('safari').open_new("www.sandeepmaheswari.tv")


    elif ("open google" in query or 'open searchbar' in query ):
        web.get('safari').open_new("www.google.com")

    elif (('play music' in query )or ('play song' in query )or ('play a song' in query) ):
         path_dir="/Users/sumitkumar/Desktop/songs/redmi ringtone.m4a"
         (subprocess.Popen(['open',path_dir]))


    elif ('time' in query or 'whats the time' in query):
        strTime= datetime.datetime.now().strftime("%H:%M:%S")
        speak(f"Sir The time is {strTime}")


    elif('open V S code' in query or 'V S code' in query or 'visual studio code ' in query or 'vs code' in query or 'open code' in query):
        path_dir="/Applications/Visual Studio Code - Insiders.app"
        speak("Opening Visual studio code")
        subprocess.Popen(['open', path_dir])


    elif(('open google Chrome' in query )or ('google chrome' in query )or ('chrome' in query )or ('browser' in query )):
         speak("Opening Google Chrome")
         path_dir="/Applications/Google Chrome.app"
         subprocess.Popen(['open', path_dir])

    elif('quit' in query or 'close' in query or 'leave' in query):
        speak("Bye Bye Sumit, Nice to talk to you")
        exit()

    elif('fuck off' in query or 'asshole' in query or 'bhag sale' in query or 'nikal' in query or 'shut up ' in query):
        speak("You are so rude! I wont respond to that")
        exit()

    elif('Yes i do like your name' in query or 'like your name' in query):
        speak("Good to know that")

    elif(('what is your name' in query)  or ("what's your name" in query )or ("whats your name" in query)):
        speak("My name is Jinny, Do you like my name!!")

    elif(('what do you eat' in query) or( 'what you eat' in query )or ("what's your food'" in query)):
        speak("I prefer Your internet data to eat!!")

    else:
        speak("I will search this in google!!")
        target=query
        kt.search(target)
     

        
    
    



        







    





