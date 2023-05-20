# def swaplist(newlist):
#     size=len(newlist)
#     temp=newlist[0]
#     newlist[0] =newlist[size-1]
#     newlist[size-1]=temp

#     return newlist
# newlist = [2,3,4,5,6]
# print(swaplist(newlist))

def newswap(newlists):
    sizw=len(newlists)
    n=int(input("enter the swap list no 1: "))
    m=int(input("enter the number 2: "))
    temp=newlists[n]
    newlists[n]=newlists[m]
    newlists[m]=temp
    return newlists

newlists = [2,3,4,5,8,9]
print(newswap(newlists))
