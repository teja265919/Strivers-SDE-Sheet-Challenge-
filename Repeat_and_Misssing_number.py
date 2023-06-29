class Solution:
    # @param A : tuple of integers
    # @return a list of integers
    def repeatedNumber(self, A):
        n = len(A)
        l = [0]*(n + 1)
        ans = []
        for i in range(len(A)):
            if(l[A[i]] == 0):
                l[A[i]] += 1
            else:
                ans.append(A[i])
                break
        s = sum(A) - ans[0]
        sm = (n*(n + 1))//2
        ans.append(sm - s)
        return ans
        
