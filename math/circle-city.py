#!/bin/python3

import math
import os
import random
import re
import sys

def solve(d, k):
    counter = 0
    r = math.floor(math.sqrt(d));
    list = []
    for i in range(0,math.floor(r)+1):
        ans_x = i**2
        # print(i)
        y = math.sqrt(d-ans_x)
        if(y.is_integer()):
            counter+= 2 if(y==0 or i==0) else 4
            # print(y,i)
    return "impossible" if (counter>k)  else "possible"

if __name__ == '__main__':
    fptr = open('output.txt', 'w')

    t = int(input().strip())

    for t_itr in range(t):
        first_multiple_input = input().rstrip().split()

        d = int(first_multiple_input[0])

        k = int(first_multiple_input[1])

        result = solve(d, k)
        print(result)
        fptr.write(result + '\n')

    fptr.close()
