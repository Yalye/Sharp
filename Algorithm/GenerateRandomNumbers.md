### Generate Random Numbers
https://medium.com/delta-force/how-computers-make-random-numbers-51e8938d9d53

Linear congruential generator(LCG), it's one of the oldest and best-known pseudorandom number generator algorithms.
```math
x(n) = (a * x(n-1) + c) % m
```
Different languages and compilers have different implementations of the LCG.
if `c=0` and m is prime or m is a power of 2, the algorithm would become a `Lehmer RNG` formulation. Its period is `m - 1`.