from fileinput import close


f= open("donkeywali.txt","r")
data= f.read()

fi=open("copieddonkeywali.txt","w")
fi.write(data)
f.close()
fi.close()