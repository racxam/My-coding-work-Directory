print("Classes and Objects in Python")
class Robot:
    def introduce_self(self):
        print(f"My name is {self.name} {self.lastname}")

r1=Robot()
r1.name="sumit"
r1.lastname="Jhaldiyal"
r1.introduce_self()

class Animal:
    legs=4
    def __init__(self,name,color):
        self.name=name
        self.color=color

        
    def traits(self):
        print(f"The Name of the animal is: {self.name} The color of the Animal is {self.color}")
    @classmethod
    def info(cls):
        return cls.legs
    @staticmethod
    def merimargi():
        print("meri margi is a static clss")

a1=Animal("Cow","White")
a1.traits()
print(Animal.legs)
print(a1.legs)
print(Animal.info())# to make this work we gotta use a decorator named @classmethod
print("hello",a1.info())
Animal.merimargi()
# a1.merimargi()# can't run


#actually there are two types of the variable in OPPs
#1. Static or class Variable-- defined in class and are static{class namespace}
#2. Intance variable{variable namespace}

#There are three Types of the Methods
# 1.class method- if we are working only with the class variable or static variable we don't need to pass self as an argument other than that we need to pass here the "cls" agrgument
# 2.instance method-- related  to objects--1.accesor methods 2. mutator methods(getter and setters basically)
# 3.static method