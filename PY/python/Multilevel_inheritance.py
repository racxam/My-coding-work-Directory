class Person:
    country="India"
    @staticmethod
    def Takebreath(): 
        print("I am breathing")
class Employee(Person):
    Company="Soft Maisto"
    
    def GetSalary(self):
        print(f"Salary is: {self.salary}")

    def Takebreath(self):
        super().Takebreath()
        print("I am employee and i am luckily breathing....")

class Programmer(Employee):
    company="E-Bakset"

    def GetSalary(self):
        print("No salary to programmer::::...")

    def Takebreath(self):
        super().Takebreath()
        print("I am programmer and i am breathing+++++++....")

# p=Person()
# p.Takebreath()
# e=Employee()
# e.Takebreath()
pr=Programmer()
pr.Takebreath()
# print(pr.country)
