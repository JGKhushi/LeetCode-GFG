class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        double r = dimensions.length; 
        double m = dimensions[0].length;
        double dlength = Integer.MIN_VALUE;
        int area = Integer.MIN_VALUE;
        for(int i = 0  ; i<r ; i++){
            int length = dimensions[i][0];
            int breadth = dimensions[i][1];
            double dl =  length*length + breadth* breadth;
            int a = length * breadth;
             if(dl == dlength){
               area= Math.max(area,a);
            }
            if(dl > dlength){
                area = a;
                dlength = dl ;
            }
                System.out.println(dl + " " + a + " " + area +" " + dlength);
           
        }
        return area;
    }
}