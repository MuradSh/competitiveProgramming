#!/bin/python3

import math
import os
import random
import re
import sys



def dynamicArray(n, queries):
    lastAnswer = 0
    arr = []
    for i in range(0,n):
        arr.insert(i,[])
    answers=[]
    for q in queries:
        idx=((q[1]^lastAnswer)%n)
        y=q[2]
        if(q[0]==1):
            arr[idx].append(y)
        else:
            lastAnswer = arr[idx][y%len(arr[idx])]
            answers.append(lastAnswer)
    return answers

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    first_multiple_input = input().rstrip().split()

    n = int(first_multiple_input[0])

    q = int(first_multiple_input[1])

    queries = []

    for _ in range(q):
        queries.append(list(map(int, input().rstrip().split())))

    result = dynamicArray(n, queries)
    # print(result)
    fptr.write('\n'.join(map(str, result)))
    fptr.write('\n')

    fptr.close()
