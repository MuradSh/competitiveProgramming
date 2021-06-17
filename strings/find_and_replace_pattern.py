def getPattern(word):
    count = 0
    existing = []
    pat = "";
    symbols = ["!","@","#","$","%","'","^","&","*","("]
    for c in word:
        if c not in existing:
            existing.append(c)
            count+=1;
            val = str(count)
            if count>=10:
                val = symbols[count-10]
            pat+=val
        else:
            pat+=str(existing.index(c)+1)
    return pat

originalPattern = getPattern(pattern);
print(originalPattern)
lst = []
for word in words:
    wPattern = getPattern(word)
    if wPattern==originalPattern:
        lst.append(word)
print(lst)
