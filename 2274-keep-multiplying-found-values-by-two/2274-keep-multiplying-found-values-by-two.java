class Solution {
    public int findFinalValue(int[] arr, int original) {
        
        int n  = arr.length;
        HashMap<Integer ,Integer> hmap = new HashMap<>() ;

        for(int i = 0 ; i < n ; i ++){
            hmap.put(arr[i] , hmap.getOrDefault(arr[i] , 0) + 1);
        }
       
    
        while(hmap.containsKey(original)){
            original *= 2; 
        }

        return original ;
         
    }
}