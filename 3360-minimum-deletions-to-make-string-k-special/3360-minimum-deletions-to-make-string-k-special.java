class Solution {
    public int minimumDeletions(String word, int k) {
        HashMap<Character,Integer> hmap = new HashMap<>();
        int n = word.length();

        for(int i = 0 ; i< n ; i++){
            hmap.put(word.charAt(i) , hmap.getOrDefault(word.charAt(i) , 0)+1 );
        }

        int arr[] = new int[hmap.size()];

    

    int idx = 0;
    for(Map.Entry<Character,Integer> entry : hmap.entrySet()){
        arr[idx] = entry.getValue();
        idx++;
    }

    Arrays.sort(arr);

    int min = Integer.MAX_VALUE;
   

    for(int i = 0 ; i<arr.length ; i++ ){
         int del = 0 ;
        for(int j= 0 ; j< i;j++){
            del += arr[j];
        }
        for(int j  = i ;j<arr.length ;j++){
            if(arr[j] - arr[i] > k){
                del += arr[j] - arr[i] - k;
            }
        }

        min = Math.min(del , min);
    }


       return min; 
        
    }
}