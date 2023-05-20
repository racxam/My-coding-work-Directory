d1={1:"a",2:"b"}
d2={2:"c",3:"d"}
print(d1,d2)
print(d1|d2)
print({**d1,**d2})
print(*d1,*d2)
d3=dict()
d3=d2.copy()
d3.update(d1)
print(d3)

l1=["sumit","shalini","mansi"]
l2=[6,3,9]
l3=dict()
for i in l1:
    for j in l2:
        l3[i]=j
        l2.remove(j)
        break
print(l3)
l2=[6,3,9]

l4=dict(zip(l1,l2))
print(str(l4))

l5={l1[i]:l2[i] for i in range(len(l1))}
print(l5)