//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.BigInteger;


// } Driver Code Ends

//User function Template for Java

class Solution{
    
    //Function to return sum of count of set bits in the integers from 1 to n.
    public static int countSetBits(int n){
        
        if(n == 0 ){
            return 0;
        }
    int x = 0 ;
    //count largest power of 2 till num less than n 
    while((1<<x) <= n){
        x++;
    }
    
    x = x-1;
    
    // set bits till 2 raise to power x - 1
    int set_bits_till_2_p_x_minus_1 = (1<<(x-1))*x;
    // most significant bits now from  2 raise to power x  to n will be 1
    int msb_set_bits_from_2_p_x_to_n = n - (1<<x) + 1;
    // now rest
    int rest = n - (1<<x);
    
    return set_bits_till_2_p_x_minus_1  + msb_set_bits_from_2_p_x_to_n  + countSetBits(rest);
    
}
}


//{ Driver Code Starts.

// Driver code
class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();//testcases
		int x, n;
		while(t-->0) {
	        n = sc.nextInt();//input n

		    Solution obj = new Solution();

		    System.out.println(obj.countSetBits(n));//calling countSetBits() method
		
System.out.println("~");
}
	}
}

// } Driver Code Ends