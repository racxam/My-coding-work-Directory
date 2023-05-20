#sTack using Queue LIFO
from queue import LifoQueue
stack=LifoQueue(maxsize=5)
print(stack.qsize())
stack.put("sumit")
stack.put("amit")
stack.put("akash")
stack.put("akshat")
stack.put("anamika")

print(f"Full : {stack.full()}")
print(f"Size:  {stack.qsize()} ")

#to pop elements form stack
print(stack.get())
print(stack.get())
print(stack.get())
print(stack.get())
print(stack.get())

print(f"Empty {stack.empty()}")