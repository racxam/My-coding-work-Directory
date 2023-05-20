#Multiple inheritance is like a child is haiving more than 1 parent class

class Employee:
    C_name="Soft Maisto"
    eCode=34

class Freelancer:
    C_name="Fiverr"
    level=0
    def upgrdelevel(self):
        self.level=self.level+1

class Programmer(Freelancer,Employee):
    name="Sumit Jhaldiyal"

child_obj=Programmer()
print(child_obj.C_name)
print(child_obj.level)
child_obj.upgrdelevel()
child_obj.upgrdelevel()
child_obj.upgrdelevel()
child_obj.upgrdelevel()
print(child_obj.level)
print(child_obj.eCode)
print(child_obj.name)