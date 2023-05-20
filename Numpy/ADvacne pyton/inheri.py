class A():
    def feature1(self):
        print("feature 1")
    def feature2(self):
        print("feature 2")
class B(A):# inhertance  for mutliple B(A,C)
    def feature3(self):
        print("feature 3")
    def feature4(self):
        print("feature 4")

a2=B()

a2.feature1()

# There are 3 types of inheritance
# 1.single
# 2.multiple
# 3.Multilevel


#__init__ constructor 
# so if we'll call the constructor of B then first constructor of B will be called only if there is not B() then we'll call A()
# super().__init__()

# if there is a multiple inheritance in which C(A,B)
# in c we'll write super().__init__()
# which super class will it call A Or B bcz we've 2 super classes
# so it will be baised towards A because A is writeen before
# so to call the B's constrctor we'll use MRO(Method Resolution Order)
#super can also other method than __init__


