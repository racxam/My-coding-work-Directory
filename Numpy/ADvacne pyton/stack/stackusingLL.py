import numpy as np
arr=np.zeros(5)
class Stack:


    def __init__(self) :
        self.i=-1

    def isFull(self):
        return 1 if self.i==5 else 0
    def isEmp(self):
        return 1 if self.i==-1 else 0
    def push(self,elem):
        if(self.isFull()):
            print("STack OVerflow")
        else:
            self.i=self.i+1
            arr[self.i]=elem
    def pop(self):
       if(self.isEmp()):
         print("STack Underflow") 
       else:
        pele=arr[self.i]
        arr[self.i]=0
        self.i=self.i-1
        return pele
    def traverse(self):
        print(arr)

    
obj=Stack()
obj.push(1)
obj.push(2)
obj.push(3)
obj.push(4)
obj.push(5)
obj.push(53)

print(obj.pop())
print(obj.pop())
print(obj.pop())
obj.traverse()

    