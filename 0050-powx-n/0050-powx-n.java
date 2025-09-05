class Solution {

    public double fn(double x , int n , int i , double ans ){
         if(i > n){
            return ans ;
         }
         ans = ans * x;
         return fn(x , n , i+1 ,ans );
    }

    public double myPow(double x, int n) {
        return Math.pow(x , n);
    }
}