```
 LIST-SEARCH(L,K)
 x = L.head
 while x != NIL and x.key != k
  x = x.next
 return x
 ```
 
 ```
 LIST-INSERT(L,K)
 x.next = L.head
 if L.head != NIL
  L.head.prev = x
 L.head = x
 x.prev = NIL
 ```
 
 ```
 LIST-DELETE(L,K)
 if x.prev != NIL
  x.prev.next = x
 else L.head = x.next
 if x.next != NIL
  x.next.prev = x.prev
``` 
<h5>
Question 1
Write the pseudo-code for the dynamic-set operation INSERT on a singly linked list in O (1) time? How about DELETE?
</h5>

```
INSERT(L,K)
  x.next = L.head
  L.head = x
```

```
DELETE(L,K)
  x.prev.next = x.next
  x.next.prev = x.prev
```


```
STACK-EMPTY(L)
  if L.head == NIL
    return true
  if else false

PUSH(L,X)
  x.next = L.head
  L.head = x
  
POP(L,X)
  if STACK-EMPTY(L)
    ERROR "Stack Underflow"
  
  x = L.head
  L.head = L.head.next
  return x
  
```
<h5>  
Implement a queue by a singly linked list L. Write the pseudo-code for the operations ENQUEUE and DEQUEUE in O (1) time. You can play with the algorithm simulation software to see how it works:
</h5>

```
QUEUE-EMPTY(L)
 if L.head = NIL
  return true
 else return false
 
ENQUEUE(L,X)
if QUEUE-EMPTY(L)
 L.head = x
else L.tail.next = x
L.tail = x
x.next = NIL

DEQUEUE(L,X)
 if Queue-EMPTY(L)
  error "Underflow
  
 else
  x = L.head
  if L.head = L.tail
   L.tail = NIL
  L.head = L.head.next
  return X
  
  ```
  


 
