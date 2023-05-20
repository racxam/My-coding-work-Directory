class Employee:
    company="Soft Maisto"
    def showDetails(self):
        print("This is an employee")

class Programmer(Employee):
    language="python"
    company="E-Basket"

    def Getlanguage(self):
        print(f"The language of the programmer is {self.language}")
    def showDetails(self):
       print("This is a programmer")

a=Employee()
a.showDetails()
p=Programmer()
p.showDetails()
print(p.language)
p.language="Java script"
print(p.language)
print(p.company)
