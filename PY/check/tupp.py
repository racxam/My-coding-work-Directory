# only 2 methods work here . count and index
# we can add tuples here and we can multiply tuples here


t1=(1,2,3,"hell",'3',3)
print(type(t1))
print(t1)
print(t1[2])
print(t1.count)
print("printing form 1 to 3")
print(t1[:3])

# sumit= tuple(("hel","mel","sel")) #double brackers are used
# print(type(sumit))
# print(sumit)

s1="yes" if "hell" in t1 else "no"
print(s1)

del s1 # it will completely delete  the tuple
# print(s1)
fruits = ("apple", "banana", "cherry")

(green, yellow, red) = fruits

print(green)
print(yellow)
print(red)
fruits = ("apple", "banana", "cherry", "strawberry", "raspberry")

(green, yellow, *red) = fruits

print(green)
print(yellow)
print(red)


fruits = ("apple", "mango", "papaya", "pineapple", "cherry")

(green, *tropic, red) = fruits

print(green)
print(tropic)
print(red)

for x in fruits:
    print(x)

tup1=(1,2,3)
tup2=(4,5,6)
print(tup1+tup2)
print(tup1*2)
tup3=tup2*3

print(tup3)
print(tup3.count(4))
print(tup3.index(5))
