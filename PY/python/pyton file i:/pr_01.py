from imp import init_builtin
from mimetypes import init


class EmpProg:
    Comp_name="Soft Maisto"
    Place="France"
    def __init__(self,name) :
        print("Welcome to Soft Maisto Mr.",name)

    def Working_days(self,no_of_projects):
        work_days=no_of_projects*(2)
        return work_days
    # def getinfo(self):
    #     name_of_emp=input("Hey! put your name under this string!!")
    #     print("The name of Programmer is !",name_of_emp)
       
    

sumit=EmpProg("Sumit")
sumit.salary="54k"
print(sumit.Comp_name)
print(sumit.Place)
print(sumit.salary)
work_days=sumit.Working_days(40)
print(work_days)
# sumit.getinfo()
print("\n\n")


harry=EmpProg("Harry")
harry.salary="50k"
print(harry.Comp_name)
print(harry.Place)
print(harry.salary)
work_days=harry.Working_days(50)
print(work_days)
# harry.getinfo()
