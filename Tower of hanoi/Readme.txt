				Tower of hanoi using recursion

Aim: to shift n disc from source to the target

conditions:

1) At a time only one disc can be shifted
2) while shifting larger one should not lie on smaller one
3) one auxillary stand can be used.

Algorithm:

1) if n=1, shift directly to the target
2) if n>1, shift (n-1) disc to the auxilary
3) while shifting, use target as auxilary
4) shift nth disc from source to the target
5) Then shift (n-1) disc from auxilary to the target

*while shifting use source as a auxiliary.

Number of shifting done will be (2^n - 1)