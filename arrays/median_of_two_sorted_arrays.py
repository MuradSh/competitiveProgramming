z = [1,2]
b = [3,4]
comb = z+b
comb = sorted(comb)
if len(comb)%2==0:
    print((comb[int(len(comb)/2)]+comb[int(len(comb)/2)-1])/2)
else:
    print(comb[int(len(comb)/2)]);
