# #strings are immutable in python 
# str="Welcome to india"
# c=str.lower()
# print(str)
# print(c)

# #lists are mutable 
# list1=[1,2,3,4,[5,4],6,"he"]
# print(list1)
# list1[2]="hi"
# print(list1) 

# #Range function returns the list
# #it is a special function
# print(range(4))

# grocerry=list()
# grocerry.append("aalo")
# grocerry.append("kela")
# grocerry.append("panner")
# grocerry.append("matar")
# print(type(grocerry))
# print(grocerry)

# grocerry.sort()# willl sort in alphabetical order

# print(grocerry)

def lipit(str):
    for i in str:
        if(i==(" " or "  " or "  ")):
            print()
        else:
            print(i,end="")
            
# def lipit(str):           
#     for i in str:
#         print(i)

            


str1="Welcome to my house"
str2="kelcome"
str1=str1+str2

# stuff=str1.split()# split will change the string into list
# print(type(stuff))
# print(stuff)

lipit(str1)

nee="Chal;bhag;bhosdike;"
wt=nee.split(';')
print(wt)