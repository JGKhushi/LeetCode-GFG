class Solution {
    public int maxProfit(int[] arr) {
        int buyPrice = arr[0];
        int profit = 0;
        int n = arr.length;
        for(int i = 1 ; i < n ; i++){
            if(buyPrice > arr[i]){
                buyPrice = arr[i];
            }
            else{
                profit = Math.max(profit , arr[i] - buyPrice);
            }
        }

        return profit;
    }
}