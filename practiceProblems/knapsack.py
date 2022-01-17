import math
def knapsack(values,weights,n,maxWeight):
    if(maxWeight<0): return -math.inf;
    if n<0 or maxWeight==0:
        return 0;

    include = values[n]+knapsack(values,weights,n-1,maxWeight-weights[n])
    exclude = knapsack(values,weights,n-1,maxWeight)

    return max(include,exclude)

print(knapsack([20, 5, 10, 40, 15, 25],[1, 2, 3, 8, 7, 4],5,10))

