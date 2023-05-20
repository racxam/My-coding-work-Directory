#python doesn't support the method overloading by default by we can achieve it using various methods

def pro(a,b):
    print(a*b)

def pro(a,b,c):
    print(a*b*c)

def pro(a,b,c,d):
    print(a*b*c*d)
pro(1,2,3,4)


def add(dt, *args):
    answer=-1
    if dt=='int':
        answer=0
    elif dt=='str':
        answer=' '
    for i in args:
        answer=answer+i
        
    print(answer)

add('int',4,5,5,6)
add('str','hello ','i ','am ','feeling ','honkey ' )

