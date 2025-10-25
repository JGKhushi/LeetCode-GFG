class Solution {
    public int totalMoney(int n) {
       int ans =  0 ;
       int i = 0  ; 
       int add = 1 ;
        int mon = 0 ;
       while(i <= n){
        if(i % 7 == 1){mon++; add = mon; };
        ans += add ;
        add++;
        i++;
       } 

       return ans-1 ;
    }
}