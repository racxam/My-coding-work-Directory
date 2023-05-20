import re


class complex:
    def __init__(self,r,i) :
        self.real=r
        self.imag=i
    def __add__(self,c):
        return complex(self.real+c.real,self.imag+c.imag)
    def __str__(self):
        return f"{self.real}+{self.imag}i"

    
c1=complex(4,4)
c2=complex(3,4)
print(c1+c2)