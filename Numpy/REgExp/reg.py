import re
# re is used to use the regular expression in python
txt= "The rain is in Vietnaam the spain"
x= re.search("^The.*spain",txt)
print(x)

# re have 4 methods
# findall= list containing all matchs
# search= return a match object
# split= return a list where the string is split in each match
# sub= Replace one or more matches with a string

# MetaCharacters
#[]-->set of chars  it will find all the lower case alphabetical character form a to s in this example
print()
print(re.findall("[a-s]",txt))
#. --> it used any char except newline it is used as followed by any character
print(re.findall("sp..n",txt))
#^ --> starts with certain character
print(re.findall("^The",txt))
print(re.findall("^lol",txt))

#$ means ends with---> # it is used at the end it's its speacility
print(re.findall("spain$",txt))

#* -> zero or more than zero occurances
print(re.findall("V.*m",txt))


# + one or more than one occurances
print(re.findall("V.+m",txt))

#{} --> exactly specifying the no of characters
print(re.findall("V.{6}m",txt))

#?--> 0 or 1 occurances
print(re.findall("T.?e",txt))

# it will use as either or 
txtj = "The rain in Spain falls mainly in the plain!"
print(re.findall("falls|stays",txtj))



