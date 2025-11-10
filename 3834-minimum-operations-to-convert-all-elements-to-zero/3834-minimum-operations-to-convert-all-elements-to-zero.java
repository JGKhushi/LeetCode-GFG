class Solution {
    public int minOperations(int[] nums) {
        Stack<Integer> stk  = new Stack<Integer>();
        int ans = 0 ;

        for(int num : nums){
            while(!stk.isEmpty() && stk.peek() > num){
                stk.pop();
            }

            if(num != 0 && (stk.isEmpty() ||  num > stk.peek() ) ){
                ans++ ;
                stk.push(num);
            }

        }

        return ans ;
    }
}