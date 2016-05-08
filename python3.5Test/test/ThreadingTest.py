import threading
import time
class ThreadingTest:
    def __init__(self,n):
        self.n=n

    def run(self):
        n=self.n
        while n<100:
            n+=1
            print("the num1 is   %d\n"%(n))
            time.sleep(3)

    def run1(self):
        n = self.n
        while n > -100:
            n -= 1
            print("the num2 is   %d\n" % (n))
            time.sleep(3)

class ThreadingTest1:
    def __init__(self,n):
        self.n=n

    def run(self):
        n = self.n
        while n > -100:
            n -= 1
            print("the num2 is   %d\n" % (n))
            time.sleep(3)


k=ThreadingTest(0)
k1=ThreadingTest1(0)
Thread=[]

t1=threading.Thread(target=k.run)

t2=threading.Thread(target=k.run1)

#t1.setDaemon(True)
t1.start()
#t2.setDaemon(True)
t2.start()

print(t1.is_alive())

