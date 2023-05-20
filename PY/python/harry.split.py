from pickletools import markobject


def manmargi(msg,name):
    newstr= msg.replace(name,"")
    return newstr.strip()

msg="     sumit is a bad boy    "
res=manmargi(msg,"sumit")
print(res)