s1={11,1,2,3,4,5}
s2={16,4,5,6,7,8}
# s1.update(s2)
print(s1)
# it will remove the neeeded eleement
s1.discard(4) # it will not raise an error if element not fount
print(s1)
#It will delete the python set
# del s2
# will delete the s2 set 
s1=s1.union(s2)
print(s1)
print(min(s1))

s="sumit jhadliyal"
s=list(s)
s=set(s)
print(type(s))
print(s)

#This will create a frozen set in python which is immutable
# s=frozenset(s)
s.add(1)
print(s)

s.pop()
print(sorted(s1))
# 