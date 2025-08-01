class Solution {

     static final int MOD = 1_000_000_007; 
     
    public static  long pow(int n , long x){
        if(x == 0 ){
            return 1 ;
        }
    long half = pow(n , x/2);

        if(x % 2 == 0){
            return (half * half)% MOD ; 
        }
        return( half * half * n)% MOD;
    }
    public int countGoodNumbers(long n) {
        long even = 0 ;
        long odd = 0 ;
        if( n % 2 ==  0){
            // even places 
        even =  pow(5 , n/2 );
        // odd places 
         odd = pow(4 , n/2 );
        }
        else{
            // even places 
        even =  pow(5 , (n/2)+1 );
        // odd places 
         odd = pow(4 , n/2 );
        }

        long result = (even * odd) % MOD;
return (int) result;

    }
}
