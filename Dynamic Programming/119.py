import math
def getRow(rowIndex: int):
    r=[]
    for i in range(rowIndex+1):
        r.append([])
        for j in range(0,i+1):
            r[i].append(math.factorial(i)/((math.factorial(i-j)*math.factorial(j))))    
    return r[rowIndex];


print(getRow(3))
        