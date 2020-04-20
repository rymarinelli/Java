<h5>
Question 1 
Demonstrate the insertion of the keys 5, 28, 19, 15, 20, 33, 12, 17, 10 into a hash table with collisions
resolved by chaining. Let the table have 9 slots, and let the hash function be h(k) = k mod 9.

5|28|19|15|20|33|12|17|10
5| 1| 1| 6| 2| 6| 3| 8| 1

1| 10,19, 28
2| 20
3| 12
5| 5
6| 15, 33
8| 17

</h5>

<h5>
Question 2
Consider inserting the keys 10, 22, 31, 4, 15, 28, 17, 88, 59 into a hash table of length m = 11
using open addressing with the primary hash function h(k) = k mod m. 
Illustrate the result of inserting these keys using linear probing and quadratic probing
</h5>

10|	22  |31|	4|	15|	28	|17|	88|	59
10|	0	 |  9|	4	| 4	|6	  |6|  0	|   4
 
