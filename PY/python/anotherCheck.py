from ipaddress import v4_int_to_packed


class Vector:
    def __init__(self,vec) :
        self.vec=vec
    def __str__(self) :
        return f"{self.vec[0]} + {self.vec[1]} + {self.vec[2]}"

v1=Vector([1,3,4])
v2=Vector([3,5,6])
print(v1)
print(v2)
