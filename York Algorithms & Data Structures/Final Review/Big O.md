43. Describe	the	order	of	growth	of	each	of	the	following	code	sections,	using		
O	notation:

<br> <strong> O(N) </strong> </br>
<br> <strong> T(N) = c1 + (n-1) + c2 </strong> </br>
<strong> T(N) = n + b -1 </strong>
``` java
a. count = 0;                        
for (i = 1; i <= N; i++)
count++;
```
<br> <strong> O(N^2) </strong> </br>
<br> <strong> T(N) = c + (n-1) + (n-1) + c2 </strong> </br>
<br> <strong> T(N) = n^2 + nb </strong> </br>
```java
b. count = 0;
for (i = 1; i <= N; i++)
for (j = 1; j <= N; j++)
count++;
```

<br><strong> O(logN) </strong></br>
<br><strong> T(N) = c1 + c2 + n/2 + c4 + c5 </br> </strong>
<br><strong> T(N) =  logN + nb </strong></br>

```java
c. 
value = N;
count = 0;
while (value > 1)
{
  value = value / 2;
  count++;
}
```
<br> <strong> O(1) </strong></br>
<br><strong> T(N) = c1 + c2 + c3 + c4 </strong> </br<
```java
d. count = 0;
value = N;
value = N * (N – 1);
count = count + value;
```
<br> <strong> O(N) </strong> </br>
<br> <strong> T(N) = c1 + (n-1) + c2 + c3 </strong> </br>
<br> <strong> T(N) = n + b </strong> </br>

```java
e. count = 0;
for (i = 1; i <= N; i++)
      count++;
for (i = N; i >= 0; i--)
      count++;
```
<br> <strong> O(N) </strong> </br>
<br> <strong> T(N) = c1 + n-1  + c2 +c3 </strong> </br>
<br> <strong> T(N) = n + b </strong></br>

```java
f. count = 0;
for (i = 1; i <=N; i++)
for (j = 1; j <= 5; j++)
count++;
```
