class Solution:
    def replaceElements(self, arr: List[int]) -> List[int]:
        maxright = -1
        n =len(arr)
        ans = [0] * n

        for i in range(n-1,-1,-1):
            ans[i] = maxright
            maxright = max(arr[i] , maxright)
        
        return ans    