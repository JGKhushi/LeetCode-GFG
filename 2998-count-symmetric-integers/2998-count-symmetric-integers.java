class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int ans = 0 ;
        for(int i = low; i<=high ; i++){
        String num =  Integer.toString(i); ; 
            if(num.length() % 2 == 0){
                
                int b = 0 ;
                int e = 0 ;
                for(int j = 0 ; j<num.length()/2 ; j++ ){
                 b += Integer.parseInt(String.valueOf(num.charAt(j)));
                 e += Integer.parseInt(String.valueOf(num.charAt(num.length() - 1 - j)));

                }
                if(b==e){
                    // System.out.println(num);
                    ans++;
                }
     
            }
        }

        return ans;
    }
}