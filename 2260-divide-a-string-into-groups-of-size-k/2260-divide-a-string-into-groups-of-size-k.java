class Solution {
    public String[] divideString(String s, int k, char fill) {
        int n = s.length();
        int ans_size  = (int)(Math.ceil( n / k));
        if((ans_size * k) != n){
            ans_size++;
        }
        String ans[] = new String[ans_size];
        int start = 0 ;
        for(int i = 0  ; i< ans_size ; i++){
            String ele = "";
            for(int j=start ; j< start+k ; j++){
                if(j<n){
                     ele += s.charAt(j);
                }
               
            }

            if(ele.length() != k){
                for(int m = ele.length() ; m<k ; m++){
                    ele += fill ;
                }
            }
            ans[i] = ele;
            start = start + k;
        }

        return ans;

    }
}