print("Advaced python ")
x=3*10**6
print(f"My income is ${x:,}")
pi=22/7
print(f"{pi:.5f}")

#f strings in pyton supports inplace bollean logics
# new_user=False
new_user=True
name="Sumit007"
print(f"{'Congratulation ' if new_user else 'Welcome back : '}{name}!")


#now we'll write values with names
print(f"{name=:} | {new_user=:}")
fomttd=eval(f"f'{name}'")# it is evaluation the f strin
print(fomttd)

#use of format (r% is used for boolean)
print("My name is {} and the value of boolean is {} ".format(name,new_user))
print("My name is %s and the value of boolean is %r" % (name,new_user))

#from now on here's how i'll create an empty string
print("foo "*-8)# it will create an empty sting


i=34
print("here's the chr convert the integer into the charcater")
print(chr(i))
print(ord(chr(i)))#magic
str="hello who the HELl is sHe to deCIde wHAt Should Happen Your mind"
print(str[4])
# str[4]='i' #its immutable
# but we can do what we want
print(str[:3]+'i'+str[4:])
print(str.capitalize())
print(str.upper())
print(str.lower())
print(str.swapcase())#chote bade and bade chote ho jyenge

fltu="the soft maisto"
print(fltu.title())#first letter of each word will be capitalised
#.count , .endswith, .startswith,.find ,.index

print(fltu.rfind('oft'))#will give the highest index
print(fltu.find('o'))#will give the highest index

print(fltu.index('oft'))
print(fltu.rindex('t'))

print("False".isidentifier())

# lstrip rstrip strip
strchek="       I loved a Asshole all over my life     "

print(strchek,end=" ")
print("hello")
print(strchek.lstrip())
print(strchek.rstrip(),end=" ")
print("hello\n new")

strchekc="********I loved a Asshole all over my life     "
print(strchek.lstrip("*"))
# it pads it with 0
print("45".zfill(6))

list1=["sumit","is","a","good","guy","but","he","should","not","be","so","good"]
str1_oflist1=" $ ".join(list1)
print(str1_oflist1)

st_r="I know what i should do but lemme see what she thinks about me"
lst=list(st_r)
print(lst)