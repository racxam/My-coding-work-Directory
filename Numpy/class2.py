list=[]
print(type(list))
list.append(1)
list.append(2)
list.append(6)
list.append(7)
list.append(8)
list.append(6)
list.insert(4,4)# insert(position, element) if postion is not available then it will append
print(list)
# list.remove(1)# it will remove the first input element 
# print(list)
# poped=list.pop(2)# remove last index if positon is not specified
# print("The poped element is ",poped)
# print(list)
# list.clear()# remove all the elements
# print(list)

ind=list.index(6,3,7)
print("Index of the element 6 is ", ind)
