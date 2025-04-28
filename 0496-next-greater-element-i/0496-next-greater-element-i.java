class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> mp = new HashMap<>();
        Stack<Integer> stk = new Stack<>();
        int  n = nums1.length;

        for(int num : nums2){
            while(!stk.isEmpty() && num > stk.peek()){
                 mp.put(stk.pop() ,num  );
            }
            stk.push(num);
        }

        int ans[] = new int[n];
        for(int i = 0 ; i< n ;i++){
            ans[i] = mp.getOrDefault(nums1[i] , -1);
        }

        return ans;
    }
}