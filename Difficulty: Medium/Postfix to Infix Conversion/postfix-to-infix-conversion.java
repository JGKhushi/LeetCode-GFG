//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            sc.nextLine();
            String s = sc.next();
            Solution obj = new Solution();
            String ans = obj.postToInfix(s);
            System.out.println(ans);
        
System.out.println("~");
}
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    static String postToInfix(String s) {
        // code here
        int n = s.length();
        Stack<String> stk = new Stack<>();
        for(int i=0;i<n;i++){
            char c = s.charAt(i);
          if(Character.isLetterOrDigit(c)){
              stk.push(Character.toString(c));
          }  
          else{
              String s1 = stk.pop();
              String s2 = stk.pop();
              stk.push("("+s2 + c + s1+")");
          }
        }
        
        return stk.peek();
        
    }
}
