
class Solution:
    def compareNM(self, N: int, M: int) -> str:
        # code here
        if(N > M):
            return "greater"
        elif(N<M):
            return "lesser"
        else:
            return "equal"



#{ 
 # Driver Code Starts

if __name__=="__main__":
    t = int(input())
    for _ in range(t):
        
        n = int(input())
        
        
        m = int(input())
        
        obj = Solution()
        res = obj.compareNM(n, m)
        
        print(res)
        

        print("~")
# } Driver Code Ends