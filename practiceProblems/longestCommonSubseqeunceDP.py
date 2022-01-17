def lc(s1,s2):
    return lcs(s1,s2,len(s1)-1,len(s2)-1)

def lcs(s1,s2,m,n):
    if m<0 or n<0:
        return 0;
    
    if s1[m]==s2[n]:
        return lcs(s1,s2,m-1,n-1)+1;
    
    return max(lcs(s1,s2,m-1,n),lcs(s1,s2,m,n-1))

print(lc("abcde","ace"))