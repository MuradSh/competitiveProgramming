class Solution:
    memo=[]
    def generateParenthesis(self,n: int):
        self.memo = []
        self.r(n,"",[])
        return self.memo;


    def r(self,n,st="",memo=[]):
        if(n==0): return "";
        if(st.count("(")==n and st.count(")")==n): return st;
        if(st.count("(")==n  and st.count(")")==0): return st+")"*n;
        if(st.count("(")<n): 
            memo.append(self.r(n,st+"(",memo))
        if(st.count("(")>st.count(")")): 
            memo.append(self.r(n,st+")",memo))
        memo = [i for i in memo if i is not None]
        if(len(memo)>0):
            self.memo = memo;
        # print(memo)

a = Solution()
print(a.generateParenthesis(2))
print(a.generateParenthesis(1))
print(a.generateParenthesis(3))
