class Solution {
    public String largestOddNumber(String num) {
        int n = num.length();

        String ans = "";
        int  i = n - 1;
        while(i>=0 && (num.charAt(i) - '0') % 2 == 0){
            i--;
        }

        if(i>=0){
        ans = num.substring(0,i+1);
        }

        return ans;
    }
}