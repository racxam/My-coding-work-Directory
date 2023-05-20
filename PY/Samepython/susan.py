class Train:
    destination=" "
    def BookTicket(self,names,age):

        
        if(age>=18): 
            print("Mr.",names," You can book your ticket ")
        else:
            print("You can't book your age is less than 18 years")
            exit()


        destination=input("Enter your destination\n")
        print(f"Mr. {names} your Ticket is booked for {destination}!! Congratulations!!\n Your Ticket no. is {(age*13)+12345}")

    yesORno=True
    def GetStatus(self):
        destinations=['agra','kanpur','bareli','bhadrabad','hindolakhal']
        destination=input("For which city you wants to get status: \n")
        for i in destinations:
            if(destination==i):
                YesORno=True

                
                break
            else:
                YesORno=False

    
    
        if(YesORno):
            print("Yes Train is available for this spot!! you can book the ticket") 
        else:
            print("No Train is available for this spot at this moment!!")     
         




    def FareInfo(self):
        destinations=['agra','kanpur','bareli','bhadrabad','hindolakhal']
        ask_for_fare=input("Enter the city name you wants to get fare of:")
      
        if(ask_for_fare==destinations[0]):
             print("1000rs only")
        elif(ask_for_fare==destinations[1]):
             print("2000rs only")
        elif(ask_for_fare==destinations[2]):
             print("1300rs only")
        elif(ask_for_fare==destinations[3]):
             print("1030rs only")
        elif(ask_for_fare==destinations[4]):
             print("1200rs only")
        else:
            print("This Destination is not available:\n")
    

ask=input("Do you wants to use our service press ON\n")
if(ask=="ON"):
    print("Yes You can Take Advantage of Us:\n")
    
else:
    print("Opps! if you wants to use only press ON......\n") 
    exit()


names=input("Enter your name Mr.\n")
age=input("Enter your age Mr.\n")

age=int(age)

name=Train()

choice=input("What Service Do you wish to take form us!!!\n\n\
    1.If you wants to BOOK A TICKET press 1 \n\
    2.If you wants to GET INFORMATION ABOUT DESTINATION TRAINS press 2\n\
    3.If You wants to GET INFORMATION ABOUT FARE OF TRAIN press 3\n\n") 
choice=int(choice) 

if(choice==1):
    name.BookTicket(names,age)
elif(choice==2):
    name.GetStatus()
elif(choice==3):
    name.FareInfo()
else:
    print("you can only press 1 2 or 3")
