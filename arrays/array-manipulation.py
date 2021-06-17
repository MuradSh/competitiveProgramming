#!/bin/python3

import math
import os
import random
import re
import sys

# Complete the arrayManipulation function below.
def arrayManipulation(n, queries):
    arr = [0]*n
    for q in queries:
        start = q[0]-1
        end = q[1]
        new_list = arr[start:end]
        # print(new_list)
        max_in_list = max(new_list)
        if(max_in_list!=0):
            arr[arr.index(max_in_list)]+=q[2]
        arr[start]+=q[2]
        arr[end-1]+=q[2]
    return max(arr)

if __name__ == '__main__':
    # fptr = open(os.environ['OUTPUT_PATH'], 'w')

    nm = input().split()

    n = int(nm[0])

    m = int(nm[1])

    queries = []

    for _ in range(m):
        queries.append(list(map(int, input().rstrip().split())))

    result = arrayManipulation(n, queries)
    print(result)
    # fptr.write(str(result) + '\n')
    #
    # fptr.close()
