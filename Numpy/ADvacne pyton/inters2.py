#one can return many values in pyton
def check():
    return 1,2,3,4,5
one,two,three,four,five=check()
print(f"{one,two,three,four,five}")

#python only supports pointers it doesn't support refereecnes

#unpacking in python using *, **
def foo(x,y,z):
    print(x,y,z)

flist=[1,3,4]
ftuple=(2,4,6)
fdict={'one':1,'two':2,'Three':3}
foo(*flist)
foo(*ftuple)
foo(*fdict)

strv="vowels"
lisv=list(strv)
for i in enumerate(strv):
    print(i)

for j in range(-len(strv),0):
    print(strv[j])

