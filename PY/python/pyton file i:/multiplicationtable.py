f=open("table.txt","a")




for i in range(2,21):
    for j in range(1,11):
        stri=str(i*j)
        f.write(str(i))
        f.write("x")
        f.write(str(j))
        f.write("=")
        f.write(stri)
        f.write("\n")
    f.write("\n\n")
    
f.close()   
