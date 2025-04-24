//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {

            String input_line[] = read.readLine().trim().split("\\s+");
            int N = input_line.length;
            int arr[] = new int[N];
            for (int i = 0; i < N; i++) arr[i] = Integer.parseInt(input_line[i]);
            int sum = Integer.parseInt(read.readLine());

            Solution ob = new Solution();
            if (ob.isSubsetSum(arr, sum))
                System.out.println("true");
            else
                System.out.println("false");

            System.out.println("~");
        }
    }
}

// } Driver Code Ends


class Solution {

    static Boolean isSubsetSum(int arr[], int sum) {
        // code here
       
        int n = arr.length;
        Boolean[][] memo = new Boolean[n + 1][sum + 1];
        return helper(arr, sum, 0, memo);
    }

    static boolean helper(int[] arr, int sum, int index, Boolean[][] memo) {
        if (sum == 0) {
            return true;
        }
        if (sum < 0 || index >= arr.length) {
            return false;
        }
        if (memo[index][sum] != null) {
            return memo[index][sum];
        }

        // Include the current element or exclude it
        boolean include = helper(arr, sum - arr[index], index + 1, memo);
        boolean exclude = helper(arr, sum, index + 1, memo);

        memo[index][sum] = include || exclude;
        return memo[index][sum];
    }
}