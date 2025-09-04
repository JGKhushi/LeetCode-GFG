class Solution {
    public int findClosest(int x, int y, int z) {
        int xtz = Math.abs(z-x);
        int ytz = Math.abs(z-y);

        if(xtz < ytz){
            return 1;
        } else if(xtz == ytz){
            return 0 ;
        }

        return 2;
    }
}