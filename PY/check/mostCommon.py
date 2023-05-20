handle=open('check/crea.txt')
vou=dict()
for line in handle:
    line=line.lower()
    line=line.strip()
    words=line.split()
    for word in words:
        vou[word]=vou.get(word,0)+1



            