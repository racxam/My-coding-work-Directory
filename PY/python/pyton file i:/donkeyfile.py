f=open("donkeywali.txt","r") 

i=True
j=0
while(i):
    strr=f.readline()
    if("python" in strr.lower()):
        i=False
    j+=1

print(j)
