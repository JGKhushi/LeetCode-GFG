class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int lsum = 0 ; int  rsum = 0 ; 
        int sum = 0 ;
        for (int i = 0  ;i < k ; i++){
            lsum += cardPoints[i] ;
        }
        sum = lsum ;
        int n  = cardPoints.length;
        for(int i = 0 ; i<k ; i++){
            lsum -= cardPoints[k-i-1];
            rsum += cardPoints[n-1-i];
            sum = Math.max(sum , lsum + rsum);
        }

        return sum ;
    }
}