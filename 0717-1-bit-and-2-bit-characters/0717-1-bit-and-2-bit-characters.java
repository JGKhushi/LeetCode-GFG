class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        int n = bits.length;
        int i = 0 ; 
        if(n < 3){
            if(bits[0] == 1)return false ;
        }
        for( i = 0 ; i <= n-3 ;  i++){
            if(bits[i] == 1 && (bits[i+1] == 0 || bits[i+1] == 1)){
                i++;
            }
            
        }
        if(i==n-2 && bits[i] == 1){
        return false ;
        }

        return true ;
    }
}