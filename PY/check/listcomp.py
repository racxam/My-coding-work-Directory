fruits=["apple","mango","banana","sexy kela","cherry","kiwi","berry"]
#### long cut method
# newlist=[]
# for x in fruits:
#     if "a" in x:
#         newlist.append(x)
# print(newlist)

#Short cut method
newlist=[x for x in fruits if "a" in x]
print(f"Hey i am going to print a new list out of fruits which are consist of the names which consist a in them\n {newlist}")

