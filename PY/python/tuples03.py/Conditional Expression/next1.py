l1=input("enter the names: ")
l2=input("enter the names: ")
l3=input("enter the names: ")
l4=input("enter the names: ")
l5=input("enter the names: ")

lister=[l1,l2,l3,l4,l5]
name=input("Enter the name you wants to find out in list: ")
if(name==lister[0] or name==lister[1] or name==lister[2] or name==lister[3] or  name==lister[4]  ):
    print("Yes this is present in the list")
else:
    print("not present")