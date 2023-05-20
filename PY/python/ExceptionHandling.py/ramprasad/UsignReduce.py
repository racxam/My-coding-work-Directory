from functools import reduce
lister1=[1,2,3,4,5,6,7,8,9,10,22,44,54,544,4432,234,3562]
def maxfunc(x,y):
    if(x>y):
        return x
    else:
        return y
maxno= reduce(maxfunc,lister1)
print(maxno)