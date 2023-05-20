from telnetlib import DO


class Animal:
    pass
class Pets(Animal):
    pass
class Dog(Pets):
    def Bark(self):
        print("hey i am a Dog and i am Barking")

d=Dog()
d.Bark()