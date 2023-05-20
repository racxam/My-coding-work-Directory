#We use dictionary in python , they are mutable 
pocket= dict()
pocket['money']=12
pocket['candy']=3
pocket['love']=2
print(pocket)
try:
    print(pocket['loves'])
except:
    print(pocket['love'])

pocket['candy']=33
print(pocket)

# a new way of making dictionaries
dic1={'monkey':'eating', 'shalini':'love','mansi':'pureLove'}
print(dic1)

l=0
#how to make a counting histogram with the use of python dictionaries and lists
list1=['wahh','kya','seen','hai','chal ','seen','krte','hai']
pur=dict()
# a way for making 1 2 3 4.. value pairs
# for i in list1:
#     pur[i]=l
#     l=l+1
# print(pur)

# best way to do counting 
# for i in list1:
#     pur[i]=pur.get(i,0)+1 
# print(pur)

# naive way to do counting
for i in list1:
    if i not in pur:
        pur[i]=1
    else:
        pur[i]=pur[i]+1

print(pur)
print(pur.items())# here pur.items() is a list but inside the list we have (key , value)pair tuple which is immutable
print(pur.keys())
print(pur.values())


#see pyton has a beautiful thing to do in dictionaries by using two iteration variables
for i,j in pur.items():
    print(i,j)