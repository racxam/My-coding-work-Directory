import socket
s=socket.socket(socket.AF_INET,socket.SOCK_STREAM)
s.bind(('18.164.188.82',1134))
s.listen(5)
while True:# for multiple clients
    clientsocket,address=s.accept()
    print(f"Conection form {address} has been sucessfully established!")
    clientsocket.send(bytes("Welcome to the nagri of mohali ","utf-8"))
    



#so clientsockect will store the address of the clientsocket and addreess will store the address of that ip
