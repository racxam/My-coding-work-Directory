class Company:  # This is the name of the company
    Company_name="Soft Maisto!!"
    Place="Banglore!!"
    @staticmethod
    def greet():
        print("Good Morning, Sir")
    
Sumit=Company() #object created
Sumit.name="Sumit Jhaldiyal"
print(Sumit.name)
print(Sumit.Company_name)
print(Sumit.Place)
Sumit.salary="500rs/hour"
print(Sumit.salary)
Sumit.greet()
print("\n\n")
Harry=Company()
Harry.name="Harry"
print(Harry.name)
print(Harry.Company_name)
print(Harry.Place)
Harry.greet()
