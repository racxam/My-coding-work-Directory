text=input("Enter your bullshit text:\n")
text=text.lower()

# l=[]
# for i in text:
#     l.append(i)

# vowel=['a','e','i','o','u']

# def checkvowel(t):
#     if t in vowel:
#         return True
#     else:
#         return False

# repeater=filter(checkvowel,l)
# j=0
# for i in repeater:
#     j+=1

# print(j)
vowel=['a','e','i','o','u']
def checkvowel(text):
     m=0
     for i in vowel:
        for j in text:
            if(i==j):
                m+=1
                
     return m
                



s=checkvowel(text)

print(s)             




