text=input("Enter the text you wants to remove punctuations of: \n")
punc = '''!()-[]{};:'"\,<>./?@#$%^&*_~'''

for i in text:
    if (i in punc):
        text=text.replace(i,"")

        
        
print(text)

