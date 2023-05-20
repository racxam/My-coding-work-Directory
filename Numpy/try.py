# str="welcome bhai Mein hoon kon"
# newstr=str.lower()
# print(str)
# print(newstr)
# dir(str)

# stri='    Hey Bhagwan    '
# print(stri)
# print(stri.rstrip())
# # print(stri)
# print(stri.lstrip())
# # print(stri)
# print(stri.strip())
# # print(stri)

# lovt= "hey i am going to come here"
# print(lovt.startswith('hey'))
# print(lovt.startswith('H'))

# gmail="Sumitracxam@gmail.com"
# a=gmail.find('@')
# l=len(gmail)

# laterpart=gmail[a:l]
# print(laterpart)


fhandle=open('this.txt','r')
# count=0
# for l in fhandle:
#     count=count+1


# print(count)
# inp=fhandle.read()
# print(len(inp))
# print(inp[:20])

count=0
for l in fhandle:
    l=l.strip()
    if(l.startswith("it's")):
        print(l)
    