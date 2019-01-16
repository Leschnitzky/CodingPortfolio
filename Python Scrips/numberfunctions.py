
# returns the int value of N Choose R

import operator as op
from functools import reduce

def ncr(n, r):
    r = min(r, n-r)  
    numer = reduce(op.mul, range(n, n-r, -1), 1) # Does n * (n-1) * (n-2) ... * (n-r)
    denom = reduce(op.mul, range(1, r+1), 1)  # Does r!
    return int(numer / denom) # Does   n!/ (r!) * (n-r)!