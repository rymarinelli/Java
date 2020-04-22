
<strong>TREE-SEARCH, ITERATIVE-TREE-SEARCH, TREE-MINIMUM, TREE-MAXIMUM and TREE-SUCCESSOR</strong>

```  
TREE-SEARCH(x,k)
  if x== NIL or k== x.key
    return x
  if k < k.key
    return TREE-SEARCH(x.left,k)
  else return TREE-Search(x.right,k)
  ```
 ``` 
 Iterative-TREE-SEARCH(x,k)
  while x != NIL and K != x.key
    if k < x.key
      x = x.left
    else x = x.right
  return x
  ```
  ```
  TREE-MINIMUM
  while x.left != NIL
    x = x.left
  return x
  ```
  ```
  TREE-Max
  while x.right != NIL
    x = x.right
  return x
   ``` 
  
  ```
  TREE-INSERT
  y = NIL
  x = T.root
  
  while x != NIL
    y = x
    if z.key < x.key
      x = x.left
    else
      x = x.right
   z.p = y
   if y == NIL
    T.root = Z
    else if z.key < y.key
    y.left = z
    else y.right = z
    ```
  
 ``
   TREE-DELETE
   if z.left != NIL
      TRANSPLANT(T,z,z.right)
   else if z.right == NIL
      TRANSPLANT(T,z,z.left)
   else y = TREE-MIN(z.right)
      if y.p != z
      TRANSPLANT(T,y,r.ight)
      y.right = z.right
      y.right.p = y
      Transaction(T,z,y)
      y.left= z.left
      y.left.p  =y
```     
     
<h5>
  Question 1 Activity 2
  For the set of { 1, 4, 5, 10, 16, 17, 21 \}{1,4,5,10,16,17,21} of keys, 
  draw binary search trees of heights 22, 33, 44, 55, and 66.
</h5>

<strong> Height 2  </strong>
              10
            4    17
          1  5  16  21
          
          
<strong> Height 3 </strong>          
             
             10
           4    16
         1   5     17
                      21
                   
<strong> Height 4 </strong>      
            5
          4   10
         1      16
                  17
                   21
                   
<strong> Height 5 </strong>
           4
          1  5
              10
                16
                  17
                    21
                    
<strong> Question 2 </strong>
            12
         5      18   
       2  9   15  19
             13 17  27
             
<strong> Question 3 </strong>
```
           12
        5     18
      2   9  15  19
               17
               
      //Removing 18         
            12
          5     19  
        2  9  15  17
        
      //Removing 15 
           12
        5     18
      2   9  17  19
       // Removing 9
           12
        5     18
      2      15  19
               17
```

<strong> Question 4 </strong>

```
how the result of inserting 3, 1, 4, 6, 9, 2, 5 and 7 
               3
             1   4
           2    5  6    
                 7  9
               ```
               

