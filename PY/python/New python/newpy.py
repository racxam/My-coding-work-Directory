class calculator:
    def add(self,n1,n2):
        return n1+n2
    def subs(self,n1,n2):
        return n1-n2
    def mul(self,n1,n2):
        return n1*n2
    def div(self,n1,n2):
        return n1/n2


one=calculator()

first = (input("Here i am using Python Calulator! Do you wants to use ?\n If yes then enter \"on\" "))
if(first == "on"):
    print("Welcome! you can use calculator!!")
else:
    print("Please press or Enter \"on\"to use calculator")

n1= int(input("Enter the num1"))
operator = input("Enter the operator")
n2= int(input("Enter the num2"))

if(operator=="+"):
    add=one.add(n1,n2)
    print(add)
elif(operator=="*"):
    mul=one.mul(n1,n2)
    print(mul)
elif(operator=="-"):
    sub=one.sub(n1,n2)
    print(sub)
elif(operator=="/"):
    div=one.div(n1,n2)
    print(div)

