print( '''\t   *
           * *
           *   *
           * * * * ''')

for i in range(0,5):
    for j in range(0,5):
        if(i>0 and j>0):
            if(i==j or j==1 or i==4):
                print("*",end=" ")
            else:
                print(" ",end=" ")
        else:
                print(" ",end=" ")

    print()

        

