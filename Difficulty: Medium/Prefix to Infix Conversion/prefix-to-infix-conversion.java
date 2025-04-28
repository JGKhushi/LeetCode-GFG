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
            String ans = obj.preToInfix(s);
            System.out.println(ans);
        
System.out.println("~");
}
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {

    static String preToInfix(String s) {
        // code here
        Stack<String> stk = new Stack<>();
     
     for(int i = s.length() -1; i>=0; i--){
         char c = s.charAt(i);
         if(Character.isLetterOrDigit(c)){
             stk.push(String.valueOf(c));
         }
         else{
             String t1 = stk.pop();
             String t2 = stk.pop();
             stk.push("(" + t1 + c + t2 + ")" );
         }
     }
     
     return stk.pop();
     
     
    }
}
