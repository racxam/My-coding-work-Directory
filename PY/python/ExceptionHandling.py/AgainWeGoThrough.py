
try:
    a=int(input("Enter a integer value:"))
except Exception as e:
    print("it's an exception")
else:
    print("Hopefully we are successful!")

# sometimes we use finally because sometimes we have to do somthing which is really really important even if we exit the progam in exception

 
