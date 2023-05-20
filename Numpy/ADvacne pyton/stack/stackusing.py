import numpy as np
class Stack:
    def __init__(self) -> None:
        self.arr=np.zeros(10)
        self.n=10
        self.top=-1

    def push(self,ele):
        if(self.top>=self.n-1):
            print("Stack Overflow")
        else:
            self.top=self.top+1
            self.arr[self.top]=ele
