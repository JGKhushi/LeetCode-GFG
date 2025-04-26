//{ Driver Code Starts


import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int N = Integer.parseInt(br.readLine().trim());
            Solution ob = new Solution();
            int[] ans = ob.AllPrimeFactors(N);
            for(int i = 0; i < ans.length; i++)
                System.out.print(ans[i] + " ");
            System.out.println();
        }
    }
}

// } Driver Code Ends




class Solution {
    public int[] AllPrimeFactors(int N) {
        // code here
         ArrayList<Integer> primes = new ArrayList<>();

        // Check for smallest prime factor 2 separately
        if (N % 2 == 0) {
            primes.add(2);
            while (N % 2 == 0) {
                N /= 2;
            }
        }

        // Check for odd prime factors
        for (int i = 3; i * i <= N; i += 2) {
            if (N % i == 0) {
                primes.add(i);
                while (N % i == 0) {
                    N /= i;
                }
            }
        }

        // If N becomes a prime number greater than 2
        if (N > 2) {
            primes.add(N);
        }

        // Convert ArrayList to array
        int[] result = new int[primes.size()];
        for (int i = 0; i < primes.size(); i++) {
            result[i] = primes.get(i);
        }

        return result;
        
    }
}