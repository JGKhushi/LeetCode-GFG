class Solution {

  public static boolean isPalindrome(String s){
    int left = 0 ;
    int right = s.length() - 1;
    while(left <= right){
        if(s.charAt(left) == s.charAt(right)){
            left++ ;
            right--;
        }else{
            return false;
        }
    }

    return true;
  }

    public static void fn(String s , List<List<String>> ans ,List<String> step){
    int n = s.length();
     if(s==null || s.length() == 0 ){
            ans.add(new ArrayList<>(step));
            return;
        }

    for(int i = 1 ; i<=n ; i++){
        String temp = s.substring(0,i);
        if(!isPalindrome(temp)) continue;
        step.add(temp);
        fn(s.substring(i ,s.length()) ,ans ,  step );
        step.remove(step.size() - 1);
    }

    return ;

    }
    public List<List<String>> partition(String s) {
        if(s == null || s.length() == 0) return new ArrayList<>();
        
        List<List<String>> ans = new ArrayList<>();
         fn(s , ans , new ArrayList<>());

         return ans ;
    }
}