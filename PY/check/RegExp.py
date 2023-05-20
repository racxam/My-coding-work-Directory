import re
txt="The rain is in spain"
# x=re.search("^The.*spain$",txt)
# print(x)
x=re.search("\s",txt)
print(f"The first whitespace character is located in postive: {x.start()}")

ss="sumit.jhaldiyal"
y=re.match(r'\.',ss)
print(y)