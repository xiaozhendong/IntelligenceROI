import socket
addr = ("", 1256)
print(addr)
s=socket.socket(socket.AF_INET,socket.SOCK_DGRAM)
#s.sendto(b"I'm ready",("196.168.1.170",1255))
s.bind(addr)

a,b=s.recvfrom(4096)
print(a)
s.close()
