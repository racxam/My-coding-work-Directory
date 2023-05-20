import socket
s=socket.socket(socket.AF_INET,socket.SOCK_STREAM)
s.connect(("127.0.0.1",9000))
while True:
    msg=s.recv(8)
    print(msg.decode("utf-8"))

 