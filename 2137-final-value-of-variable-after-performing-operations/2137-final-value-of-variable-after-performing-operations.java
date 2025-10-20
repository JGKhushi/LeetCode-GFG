class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int n = operations.length;

        int ans = 0 ;
        for(String s : operations){
            System.out.println(s);
            System.out.println(s.equals( "X++" )|| s.equals( "++X"));
            if("X++".equals(s)|| "++X".equals(s)){
                ans++;
            }else{
                ans--;
            }
        }
        return ans;
    }
}