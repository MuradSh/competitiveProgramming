def longestCommonSubsequence(text1: str, text2: str) -> int:
    def lcs(s1,s2,m,n,memo={}):
        key = f"{m},{n}"
        if key in memo: return memo[key]
        if m<0 or n<0:
            return 0;
        if s1[m]==s2[n]:
            memo[key]=lcs(s1,s2,m-1,n-1)+1;
        if key in memo:
            memo[key] = max(lcs(s1,s2,m-1,n),lcs(s1,s2,m,n-1),memo[key])
        else:
            memo[key] = max(lcs(s1,s2,m-1,n),lcs(s1,s2,m,n-1))
            
        return memo[key]
    return lcs(text1,text2,len(text1)-1,len(text2)-1)

print(longestCommonSubsequence("abcde","ace"))