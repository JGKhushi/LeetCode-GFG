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
            String ans = obj.preToPost(s);
            System.out.println(ans);
        
System.out.println("~");
}
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    
    public static int fn(Character c){
        if(c == '+' || c == '-'){
            return 1;
        }
        else if(c == '*' || c == '/'){
            return 2;
        }
        else if(c == '^'){
            return 3;
        }
        else{
            return -1;
        }
    }
    
    public static  String pretoIn(String s){
        Stack<String> stk = new Stack<>();
        int n = s.length();
        for(int  i= n-1 ; i>= 0 ; i--){
            char c = s.charAt(i);
            if(Character.isLetterOrDigit(c)){
                stk.push(String.valueOf(c));
            }
            else{
               String t1 = stk.pop();
                String t2 = stk.pop();
                stk.push("(" + t1 + c + t2 + ")");
            }
        }
        
        return stk.pop();
    }
    
    public static String InToPost(String s){
        StringBuilder ans = new StringBuilder();
        Stack<Character> stk = new Stack<>();
        
        for(int i= 0 ; i < s.length() ; i++){
            char c = s.charAt(i);
            if(Character.isLetterOrDigit(c)){
                ans.append(s.charAt(i));
            }
           else if(s.charAt(i) == '('){
                stk.push(s.charAt(i));
            }
           else if( s.charAt(i) == ')'){
                while(!stk.isEmpty() && stk.peek() != '('){
                    ans.append(stk.pop());
                }
                stk.pop();
            }
            else{
                while(!stk.isEmpty() && fn(c)  <= fn(stk.peek())){
                ans.append(stk.pop());
            }
                stk.push(c);
            }
        }
        
        while(!stk.isEmpty()){
            ans.append(stk.pop());
        }
        
        return ans.toString() ;
    }
    
    static String preToPost(String pre_exp) {
        // code here
        pre_exp = pretoIn(pre_exp);
        return InToPost(pre_exp);
    }
}
