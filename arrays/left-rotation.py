#!/bin/python3

import math
import os
import random
import re
import sys


def rotateLeft(d, arr):
    final_change = d%len(arr)
    new_list = []
    counter=0;
    for i in arr:
        index_calc = counter-final_change;
        if(index_calc<0):
            index_calc = len(arr)+index_calc;
        new_list.insert(index_calc,i)
        counter+=1
    return new_list;

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    first_multiple_input = input().rstrip().split()

    n = int(first_multiple_input[0])

    d = int(first_multiple_input[1])

    arr = list(map(int, input().rstrip().split()))

    result = rotateLeft(d, arr)
    # print(result)
    fptr.write(' '.join(map(str, result)))
    fptr.write('\n')

    fptr.close()
