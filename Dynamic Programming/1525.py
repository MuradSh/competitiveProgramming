def numSplits(s: str) -> int:
    l = 0;
    r = 0;
    res = 0;
    p = {}
    suf = {}
    for i in range(1,len(s)):
        if s[i] in suf:
            suf[s[i]]+=1;
        else:
            suf[s[i]]=1;
    p[s[0]] = 1
    
    l = len(p)
    r = len(suf)
    if(l==r): res+=1;
    for i in range(1,len(s)):
        if(s[i] in p): p[s[i]]+=1
        else: p[s[i]]=1
        suf[s[i]]-=1;
        if(suf[s[i]]==0): suf.pop(s[i],None)
        l = len(p)
        r = len(suf)
        print(s[i],p,suf)
        if(l==r): res+=1;

    return res;

# print(numSplits('abcda'))c
print(numSplits('aaaaa'))