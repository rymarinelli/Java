<h5>
Question 1
Using the model below, illustrate the operation of merge sort on the array A = <3, 41, 52, 26, 38, 57, 9, 49>
</h5>

A = <3, 41, 52, 26, 38, 57, 9, 49>
<ul>
<li> <3,41, 52, 26> <38,57,9,49>  </li>
<li> <3,41> <26,52> <38,57> <9,49> </li>
<li> <3,26,41,52> <9,38,49,57> </li>
<li> <3,9,26,41,49,52,57> </li>



```
//p is the leftward element
//r is the rightward most element
// q is the element in the middle 

MERGE(A,p,q,r)
  n1 = q - p + 1 // Length of the first segment 
  n2 = r - q // Length of the second segment (Right most element - midpoint = right segment)
  let L[1..n1] and R[1..n2] be new arrays
  for i = 1  to n1 // For all elements in the first segment
    L[i] = A[p + i - 1] // copies the elements of the left segment
  for j = 1 to n2 // for all elements in the second segment
    R[j] = A[q + j] // copies the elements of the second segment 
   i = 1
   j = 1
  for k = p to r // For all elements
    if i > n1 \\ If I is larger 
      A[k] = R[j] \\ assign to the right most
      j = j + 1 // Move to to the next spot
    else if j > n2  \\ if j is larger
      A[k] = L[i] \\ assign to the left most
     i = i + 1 // move it to the next spot
    else
    A[k] = R[j] \\ Assign to the right most
    j = j + 1 // move it to the next spot
  ```
  <h5>
  Write Binary-Search Recurivisely
  </h5>
  
  ```
  BINARY-SEARCH(A,V, high, low)
  if low > high
    return NIL
  mid = floor((high + low)/2)
  if v == A[mid]
    return mid
  else if v > mid
    return RECURSIVE-BINARY-SEARCH(A, v, mid + 1, high)
  else
    return RECURSIVE-BINARY-SEARCH(A, v, low, mid - 1)
  
  ```
  
        
  
  
