listt=["harry","sumit","ayush","sandeep Maheswari","prasant"]
# for item in listt:
#     if(item[0]=="s"):
#         print("Congratulations!! ",item)
#     else:
#         pass
for name in listt:
     if(name.startswith("s")):
         print("Hello ",name)

num=int (input("enter the no."))
i=0
while i<10:
    print(f"{num} x {i+1} = {num*(i+1)}")
    i=i+1