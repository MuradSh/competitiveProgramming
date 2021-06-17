import math
import os
import random
import re
import sys

#
# Complete the 'solve' function below.
#
# The function is expected to return an INTEGER_ARRAY.
# The function accepts INTEGER n as parameter.
#

def solve(n):
    s = 1
    add = n-1;
    print(s,end=' ')
    for i in range(n):
        print(s+add)
        

if __name__ == '__main__':
    fptr = open('output', 'w')

    t = int(input().strip())

    for t_itr in range(t):
        n = int(input().strip())

        result = solve(n)

        fptr.write(' '.join(map(str, result)))
        fptr.write('\n')

    fptr.close()
