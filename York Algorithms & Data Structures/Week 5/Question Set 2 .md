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
MERGE(A,p,q,r)
  n1 = q - p + 1 // Length of the first segment 
  n2 = r - q // Length of the second segment 
  let L[1..n1] and R[1..n2] be new arrays
  for i = 1  to n1
    L[i] 
  
