class Vector:
    def two_d_vector(self,i,j):
        self.i=i
        self.j=j
    def print2vector(self):
        print(f"The final 2D vector is {self.i} icap + {self.j} jcap")
    
class extraVector(Vector):
    def three_d_vector(self,i,j,k):
        super().two_d_vector(i,j)
        self.k=k
    def print3vector(self):
        print(f"The final 3D vector is {self.i} icap + {self.j} jcap + {self.k} kcap")

v=extraVector()
v.three_d_vector(2,3,5)
v.print3vector()
