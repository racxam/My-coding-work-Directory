import numpy as np
# arr=np.array([(1,2,3,4,5),(1,4,3,32,46)])
# print(arr)
# print(type(arr))
# list=[1,23,3,5,23]
# print(type(list))# it will print the type
# print(arr.ndim)# it will print the dimension of array
# print(arr.shape)# it will print the shape of the array (dimension,no of elements)
# print(arr.size)# will print the total no of elements
# print(arr.dtype)# will print the type of inside elements


# # differnet way to create a numpy darray from lists
# listc=[1,2,3,4,5,3,2]
# print(listc)
# print(type(listc))

# newarr=np.array(listc,dtype='float')
# print(newarr)
# print(type(newarr))
# print(newarr.dtype)

# #we can create the numpy ndarray using python lists or tuples 
# tarr=np.array((1,2,3,4,5),dtype='complex')
# print(tarr)
# print(type(tarr))

# # we can create the 3x4 array with all zeros using numpy
# mat=np.zeros((3,4))
# print(mat)
# print(type(mat))
# print(type(mat))

# # we can creat the 3x4 array with a constant value like 2 with float datatype
# cmat=np.full((3,4),2,dtype='float')
# print(cmat)

# # we can also create a 3x4 array with random module of numpy 
# ranmat=np.random.random((3,4))
# print(ranmat)c


# #create a sequenece of integers
# seqmat=np.arange(0,55,5)
# print(seqmat)
# # creating a linespace

# lmat=np.linspace(0,100.3,10)
# print(lmat)


# Num py is also used to create an array
# one D array
# list1=[1,2,3,4,5]
# arr1=np.array(list1)
# print(arr1)
# print(type(arr1))

# creating multiple dimension arary
list3=[1,2,3,4,54]
list2=[6,7,8,9,10]
mat5=np.array([list3,list2])
# print(mat5)


#we can create an random array with empty functin 
# emp= np.empty((2,3))
# print(emp)



# we can create some same arary like another ararys with the help of the empty_like
emp_like= np.empty_like(mat5)
print(mat5)

ide=np.identity(3)
print(ide)
print(ide.shape)


snew=np.arange(0,99)
print(snew.shape)
print(snew)
snew=snew.reshape(3,33)
print(snew.shape)
print(snew)


# to make it a 1D array again from 3x 33 we'll use ravel command
snew=snew.ravel()
print(snew)

l1=[1,2,3]
l2=[4,5,6]
l3=[7,8,9]

ass=np.array([l1,l2,l3])
print(ass.sum(axis=0))
# it will transpose the matrix -- means rows into coloums and coloums into rows

ass=ass.T
print(ass)

# it will create an iterator and will print all the items

for i in ass.flat:
    print(i)

print('\n')
print('\n')
print('\n')
# we'll learn about argsort and argmin and argmax
one= np.array([1,2,3,999,0])
print(one.argmax())
print(one.argmin())
print(one.argsort())
print('\n')
print('\n')

ar=np.array([1,2,3])
ar1=np.array([3,4,5])
print(ar+ar1)
print(ar.max())
print(ar.sum())
print(ar.min())

# print(np.where(ar>2))
print(np.where(ar==2))
# print(type(np.where(ar>2)))