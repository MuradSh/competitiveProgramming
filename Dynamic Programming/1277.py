def countSquares(matrix) -> int:
    res = 0
    for i in range(0,len(matrix)):
        for j in range(0,len(matrix[0])):
                if(matrix[i][j]>0):
                    if(i>0 and j>0):
                        matrix[i][j]=matrix[i][j]+min([matrix[i-1][j],matrix[i-1][j-1],matrix[i][j-1]])
                        res+=matrix[i][j]
                    else:
                        res+=1
    return res

print(countSquares([
  [1,0,1],
  [1,1,0],
  [1,1,0]
]))
