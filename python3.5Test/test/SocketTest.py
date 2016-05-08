import socket
import time

addr = ("", 1255)
s = socket.socket(socket.AF_INET, socket.SOCK_DGRAM)
s.bind(addr)
s.sendto(b"xzd",("192.168.1.255",1256))



s.close()
