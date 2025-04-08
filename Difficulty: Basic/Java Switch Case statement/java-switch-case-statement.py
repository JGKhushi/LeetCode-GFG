#User function Template for python3
import math 

class Solution:
    def switchCase(self, choice, arr):
        # Code hereif
        
        if(choice == 1):
                return math.pi*arr[0]*arr[0]
        elif(choice == 2):
                return arr[0] * arr[1]
    

#{ 
 # Driver Code Starts
#Initial Template for Python 3

if __name__ == '__main__': 
    t = int(input ())
    for _ in range (t):
        choice = int(input())
        arr = list(map(int, input().split()))
        ob = Solution()
        if choice == 1:
            res = ob.switchCase(choice, arr)
            print("%.2f"%round(res,2))
        else:
            res = ob.switchCase(choice, arr)
            print(int(res))

# } Driver Code Ends