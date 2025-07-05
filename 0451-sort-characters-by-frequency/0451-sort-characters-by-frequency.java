class Solution {
    public String frequencySort(String s) {
        int n = s.length();
        int[] arr = new int[128];
        int[] arr2 = new int[128];

        for(int i = 0 ; i < n ; i++){
            arr[s.charAt(i)]++;
            arr2[s.charAt(i)]++;
        }

        Arrays.sort(arr);

        String ans = "";

        for(int i = 127 ; i >= 0 ; i--){
            if(arr[i] != 0){
                for(int j = 0 ; j < 128 ; j++){
                    if(arr[i] == arr2[j]){
                        int cnt = arr[i];
                        while(cnt > 0){
                            ans += (char)(j);
                            cnt--;
                        }
                        arr2[j] = 0;
                        break;
                    }
                }
            }
        }

        return ans;
    }
}
