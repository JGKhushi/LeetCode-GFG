class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n<=0) return false;
        while(n>0){
        if(n==1 ){
            return true;
        }
        if(n%2 == 1){
            return false;
        }
        System.out.println(n);
        n /= 2;
        }
        return true ;
    }
}