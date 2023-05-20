class Number:
    def __init__(self,num):
        self.num=num

    def __add__(self,num2):
        print("Chalo add karte hain")
        return self.num+num2.num

n1=Number(3)
n2=Number(5)
d=n1+n2
print(d)