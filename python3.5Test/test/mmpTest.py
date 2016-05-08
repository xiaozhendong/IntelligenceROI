#
import os

import  mmap
#mmap对象能像open对象那样被读写 但是mmap对象由于是内存映射过来的  所以减少了I/O操作
with open('xzd.bin','wb')as f:
    f.seek(100000-1)
    f.write(b'\x00')

def memory_map(file,access=mmap.ACCESS_WRITE):
    size=os.path.getsize(file)
    fd=os.open(file,os.O_RDWR)
    return mmap.mmap(fd,size,access=access)

m=memory_map('xzd.bin')
print(m[0])