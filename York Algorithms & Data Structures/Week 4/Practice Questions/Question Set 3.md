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
  
