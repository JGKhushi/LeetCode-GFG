class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        int n = nums.length ; 
        int no = nums[0] ;
                ArrayList<Boolean> ans = new  ArrayList<>();

        if(no % 5 == 0){
                ans.add(true);
            }else{
                ans.add(false);
            }
                        System.out.println(no);

        for(int i =1 ; i< n ; i++){
           no = ((no * 2) + nums[i]) % 5;
            System.out.println(no);
            if(no % 5 == 0){
                ans.add(true);
            }else{
                ans.add(false);
            }
        } 
        return ans ;
    }
}