# a
list1=eval(input('Enter the list1'))

print("Here we will calculate the cumulative product")
cp=1
interlist=list()
for i in range(len(list1)):
    cp=cp*list1[i]
    interlist.append(cp)
   

print(f"Intermidate list is : {interlist}")
print(f"final cumulative product is: {cp}")


# b


j=0
list2=list()
for i in range(len(list1)-1,-1,-1):
    list2.append(list1[i])
    
print(list2)


[print(i,end=" ") for i in list1[::-1]]
print()
[print(i,end=" ") for i in reversed(list1)]
length=len(list1)
print()
for i in range(length//2):
    list1[i],list1[length-i-1]=list1[length-i-1],list1[i]
  
   


print(list1)