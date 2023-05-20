import os
f=open("realname.txg","r")
content= f.read()
fi=open("Renamed_by_python.txt","w")
fi.write(content)

os.remove("realname.txg")
