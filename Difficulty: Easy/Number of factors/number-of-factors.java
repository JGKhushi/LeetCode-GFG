//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.countFactors(N));
        
System.out.println("~");
}
    }
}
// } Driver Code Ends


// User function Template for Java
class Solution {
    static int countFactors(int N) {
        // code here
        int ans = 0;
        for(int i = 1 ; i<Math.sqrt(N) ; i++){
            if( N%i == 0 ){
                ans += 2;
            }
        }
        
        if(N% Math.sqrt(N) == 0){
            ans++;
        }
        
        return ans;
    }
}