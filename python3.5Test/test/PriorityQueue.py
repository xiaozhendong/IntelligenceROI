import heapq
class PriorityQueue:
    def __init__(self):
        self._queue=[]
        self.index=0

    def push(self,item,property):
        heapq.heappush(self._queue,(property,self.index,item))#这里的property类表示元素排列顺序 +为从小到大 -从大到小
        self.index+=1

    def pop(self):
        return heapq.heappop(self._queue)[-1]

class Item:
    def __init__(self,name):
        self.name=name

    def __repr__(self):
        return 'Item({!r})'.format(self.name)
if __name__=="__main__":
    s=PriorityQueue()
    s.push(Item('foo'),1)
    s.push(Item('xzd'),4)
    s.push(Item('xzd2'),3)
    print(s.pop())
    print(s.pop())
    print(s.pop())