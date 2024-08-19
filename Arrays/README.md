# Arrays

Arrays are one of the most fundamental building blocks of data strcutures. Think of these as a list of objects (e.g [1, 2, 3, ...]). 
<ul><li>Lets say we are given an array "A"</li><li>A[i] denotes the (i+1)th object stored in the array.</li></ul>
We use i+1 convention because the first index of the array is 0. As a rule of thumb:
<ul><li>Retrieveing and updating on A[i] takes O(1) time</li><li>Traversing through an array takes O(n) time</li></ul>

Most array problems can often be solved in O(n) space; however theres other solutions that use the array itself to optimize for O(1) space.

Other things to note:
<ul><li>You should take advantage of operating on arrays from both ends.</li></ul>