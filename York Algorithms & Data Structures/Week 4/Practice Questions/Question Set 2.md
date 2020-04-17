<h3> Question 1
  PUSH(S, 4), PUSH(S, 1), PUSH(S, 3), POP(S), PUSH(S, 8), and POP(S) on an initially empty stack S stored in array S [1 . . 6].
</h3>

<h5>
<ul>  
  <li> 4 </li>
  <li> 4|1| </li>
  <li> 4|1 | 3 </li>
  <li> 4|1 </li>
  <li> 4|1|8 </li>
  <li> 4|1 </li>
</ul> 
</h5>

<h3>
Question 2  
Using Figure 10.2 (Links to an external site.) in the Algorithms textbook as a model, illustrate the result of each of the operations ENQUEUE(Q, 4), ENQUEUE(Q, 1), ENQUEUE(Q, 3), DEQUEUE(Q), ENQUEUE(Q, 8), and DEQUEUE(Q) on an initially empty queue Q stored in array Q [1 . . 6]. 
</h3>

<h5>
 
<ul>
  <li> 4| </li>
  <li> 4 |1 </li>
  <li> 4|1|3 </li>
  <li> 3|1 </li>
  <li> 1|3|8 </li>
  <li> 3|8/li>
 </ul> 
 
 
<h5>
 Question 3 
  Write the ENQUEUE and DEQUEUE algorithms using pseudo-code conventions to detect underflow and overflow of a queue. </h5>
 
 ```
 QUEUE-EMPTY(Q)
 if Q.head == Q.tail
  return true
 else return false
 
 QUEUE-FULL
 if Q.head == 1 and Q.tail = Q.length
  return true
 else return false
 
 ENQUEUE(Q,X)
 if QUEUE-FULL(Q)
  Error "Overflow" 
 else
  Q[Q.tail] = x
  if Q.tail == Q.length
    Q.tail = 1
  else Q.tail = Q.tail + 1
  
 DEQUEUE(Q,X)
 if QUEUE-EMPTY(Q)
  Error "Underflow"
 
 else
  x = Q[Q.head] 
  if[Q.head] == Q.length
    Q.head = 1
  else Q.head = Q.head + 1
  return x
 
  
  
 
 
 
 ```
 
  

