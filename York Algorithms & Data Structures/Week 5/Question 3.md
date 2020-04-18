<strong>
Question 1
Using the model below, illustrate the operation of: MAX-HEAPIFY (A, 3) on the array A = {27, 17, 3, 16, 13, 10, 1, 5, 7, 12, 4, 8, 9, 0}
</strong>

        27
  17          3
 16|13      10|1
5|7  12|4   8|9   0

     
        27
   17         10
 16|13        9|1 
5|7  12|4    8|3  0

Question 2 
<h5>
Starting with the procedure MAX-HEAPIFY, write the pseudo-code for the procedure MIN-HEAPIFY(A, i), 
which performs the corresponding manipulation on a min-heap. What is the running time for the MIN-HEAPIFY procedure?
</h5>


``` 
MIN-HEAPIFY(A,i)
  l - Left(i)
  r - Right(i)
  
  if l <= heap.size and A[L] < A[i]
  smallest = l
  else smallest = i
  
  if else r <= heap.size A[r] < A[smallest]
  smallest = r
 
 if smallest != i
  exchange A[i] with A[smallest]
  MIN-HEAPIFY(A,smallest)
  ```
 
 <h5>
 Question 5
 </h5>
<style> 
 h5 {
  color: maroon;
  margin-left: 40px;
}
 </style> 
  
