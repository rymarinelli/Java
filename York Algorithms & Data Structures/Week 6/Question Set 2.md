
TREE-SEARCH, ITERATIVE-TREE-SEARCH, TREE-MINIMUM, TREE-MAXIMUM and TREE-SUCCESSOR

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
   
      
     
