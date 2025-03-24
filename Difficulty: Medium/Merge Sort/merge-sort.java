//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());

        while (t-- > 0) {

            ArrayList<Integer> array1 = new ArrayList<Integer>();
            String line = read.readLine();
            String[] tokens = line.split(" ");
            for (String token : tokens) {
                array1.add(Integer.parseInt(token));
            }
            ArrayList<Integer> v = new ArrayList<Integer>();
            int[] arr = new int[array1.size()];
            int idx = 0;
            for (int i : array1) arr[idx++] = i;

            new Solution().mergeSort(arr, 0, arr.length - 1);

            for (int i = 0; i < arr.length; i++) System.out.print(arr[i] + " ");

            System.out.println();

            System.out.println("~");
        }
    }
}

// } Driver Code Ends


class Solution {

    void mergeSort(int arr[], int l, int r) {
        // code here
        if(l >= r){
            return ;
        }
        
        int mid = l+(r-l)/2;
        
        mergeSort(arr,l,mid);
        mergeSort(arr,mid+1 , r);
        merge(arr,l,mid,r);
    }
    
     void  merge(int arr[] , int l , int mid  , int r){
         
         int n1 = mid - l + 1;
         int n2 = r - mid ;
         int L[] = new int[n1];
         int R[] = new int[n2];
         
         for(int i=0;i<n1;i++){
             L[i] = arr[l+i];
         }
         for(int j=0 ; j<n2; j++){
             R[j] = arr[1+mid+j];
         }
         int left = 0 ; 
        int right = 0;
        int k = l;
        
        
        while(left < n1 && right < n2){
            if(L[left] <= R[right]){
               arr[k] = L[left]; 
               left++;
            }
            else{
                arr[k] = R[right];
                right++;
            }
            k++;
        }
        while(left < n1){
            arr[k++] = L[left++] ;
        }
        
        while(right < n2){
            arr[k++] = R[right++];
        }
        
       
        
    }
}
