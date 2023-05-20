# a=[[1,2],[3,4],[5,6]]
# print(a)
# b = list(itertools.chain.from_iterable(a))
# print(b)

# a=[“10”,”9",”8",”7"]
# print(a[::-1])
# a=["10","9","8","7"]
# a=[10,9,8,7]
# b=a[::-1]
# for x,y in zip(a,b):
#     print(x,y)

# list1=eval(input("Enter the list:"))
# print(type(list1))
# print(list1)

# print(eval("4**3"))

# a=(1,2,3,4)
# b=("A","B","C")

# x=zip(a,b)
# print(type(x))
# for i,y in x:
#     print(i,y)


a=[1,2,2,3,2,7,8,1,1,1,2,2]

print(type(a))

x=max(a,key=a.count)
print(x)



print("100\n"*5)

a=["I","am","a","good","boy"]
print(" ".join(a))