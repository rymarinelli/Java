<h5>
Question 1
Using Figure 2.2 as a model,
illustrate the operation with ⟨31,41,59,26,41,58⟩.
</h5>

<ul>
  <li>31|41|59|26|41|58 </li>
  <li>31|41|59|26|41|58 </li>
  <li>26|31|41|59|41|58</li>
  <li>26|31|41|41|59|58</li>
  <li>26|31|41|41|58|59</li>
</ul>
```
INSERTION-SORT(A)
for j = 2 to A.length  // From the second most left me to end 
  key = A[j] // which is the current number being sorted
  i = j - 1 // The number just left of the number being sorted 
  while i > 0 and A[i] < key // While not the last element and is less than the right most element
  A[i+1] = A[i] // replace
  i = i - 1 //decrementing through the loop
  A[i + 1] = key  // new key assigned to the lesser number 
  
