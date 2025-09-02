class Solution {
    public String frequencySort(String s) {
        int[] arr1  = new int[76];
        int[] arr2  = new int[76];

        int n = s.length();

        for(int i = 0 ; i< n ; i++){
            int c = s.charAt(i)-'0';
            arr1[c]++;
            arr2[c]++;
        }

        String ans = "";
        Arrays.sort(arr1);
        for(int i = 75 ; i>= 0 ; i--){
            if(arr1[i] == 0){
                continue;
            }
            for(int j = 0 ; j <= 75 ; j++){
                if(arr1[i] == arr2[j]){
                    int count = arr1[i] ;
                    while(count-- > 0){
                        ans+= (char)('0'+j) ;
                    }
                    arr2[j] = 0;
                    break;
                }
            }
        }


        return ans;


    }
}