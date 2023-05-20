class Employee:
    Company="Google"

harry=Employee()
sumit=Employee()
print(harry.Company)
print(sumit.Company)
Employee.Company="Soft Maisto"
print(harry.Company)
print(sumit.Company)

