tpl=(1,2,3,4,4,5)
print(type(tpl))
print(max(tpl))
#tuples and strings are immutable
x=(1, 2 ,6)
print(x)

str="welcome"
str="newstr"
print(str)


(x,y)=(4,5)
print(x,y) 
print((0,1,2)<(0,5,6))

# key order mein sorting krta hai
# d={'a':1,'d':2,'c':3}
# t=sorted(d.items())
# print(t)


#how to sort in value order
d={'a':1,'d':5,'c':3}
tmp=list()
for k,v in d.items():
    tmp.append((v,k))

print(tmp)
tmp= sorted(tmp,reverse=True)# doing reverse sorting in dictionary
print(tmp)