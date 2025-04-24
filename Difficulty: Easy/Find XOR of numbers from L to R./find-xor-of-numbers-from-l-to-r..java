//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t;
        t = sc.nextInt();
        while (t-- > 0) {

            int l;
            l = sc.nextInt();

            int r;
            r = sc.nextInt();

            Solution obj = new Solution();
            int res = obj.findXOR(l, r);

            System.out.println(res);
        
System.out.println("~");
}
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    private static int solve(int n){
        if(n%4==1) return 1;
        else if(n%4==2)return n+1;
        else if(n%4==3)return 0;
        return n;
    }
    public static int findXOR(int l, int r) {
        return solve(l-1)^solve(r);
    }
}