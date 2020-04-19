<h5>
Question 1
How would you modify QUICKSORT to sort in decreasing order?
</h5>

```
Switch the condition for paritioning to 
A[j] >= x
```

<h5>
Question 2
Using the substitution method to prove that the recurrence T(n)=T(n-1) + θ(n) has the solution T(n)= θ(n^2).
</h5>

```
T(n) = T(n-1) + cn
     <=  c(n-1)^2  + cn
     <=  n^2 -2nc + c + cn
     <= c1n^2
```

<h5>
Question 3
Show that the running time of QUICKSORT is Ө(n2) when the array A is sorted in decreasing order.
</h5>

```
If the array is already sorted in decreasing order, the pivot element will be less than the other elements.
The partition subprocess will take O(n). But, the pivot will perform poorly and it will take more iterations of the pivoting process
akin to insert sort giving O(n^2)
```

<h5>
Question 4
During the running of the procedure RANDOMIZED-QUICKSORT, 
how many calls are made to the random-number generator RANDOM in the worst case?
How does the answer change in the best case?
</h5>

```
For the worst case
T(n) = T(n-1) +1 = O(n)

For the best case,
T(n)=T(n−1)+1=n=Θ(n).

Since it is random, it is linear time essentially. 


<h5>
Question 5
Why do we expect the average-case performance of a randomised algorithm and not its worst-case performance?
</h5>

<h5>
Since you are performing a randomized sub-operation, you would be looking at the expected values from the
the probabalistic aspect of the algroithm. It makes more sense to view average-case, since it is rather unlikely
you would get worst-case performance. You would would have to be very unlikely to partion badly teach time
</h5>



