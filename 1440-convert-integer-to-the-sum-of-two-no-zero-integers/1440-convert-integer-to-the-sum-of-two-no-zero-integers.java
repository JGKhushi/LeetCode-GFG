class Solution {

    public static boolean checkfn(int num){
        while(num > 0){
            if(num % 10 == 0){
                return false;
            }else{
                num = num / 10 ;
            }
        }
        return true;
    }
    public int[] getNoZeroIntegers(int n) {
      int ans[] = new int[2]; 
      for(int i = 1 ; i< n ; i++){
      int fn = i ; int sn = n-i;
         boolean check2 = checkfn(n-i);
         boolean check1 = checkfn(i);
         if(check1 && check2 ){
            ans[0] = fn ;
            ans[1] = sn ;
            break;

         }
         
      }

      return ans;
    }
}