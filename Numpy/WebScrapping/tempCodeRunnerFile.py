s=socket.socket(socket.AF_INET,socket.SOCK_STREAM)
s.bind((sockect.gethostname(),1134))
s.listen(5)