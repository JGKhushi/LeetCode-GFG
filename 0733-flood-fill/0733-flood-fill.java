class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        
        Queue<int[]> q = new LinkedList<>();

        q.offer(new int[]{sr,sc});

        int[] dx = {0,1,0,-1};
        int[] dy = {1,0,-1,0};

        int row =  image.length;
        int col = image[0].length;

            int pc = image[sr][sc];
        while(!q.isEmpty()){
            int sz = q.size();
            int[] point = q.poll();
            image[sr][sc] = color;
            for(int i = 0 ; i< sz ; i++){
                for(int j = 0 ; j< 4 ; j++){
                int x = point[0]+dx[j];
                int y = point[1]+dy[j];

                if(x>=row || y>= col || x< 0 || y< 0 ||image[x][y] != pc || image[x][y] == color ){
                    continue;
                }
                if(image[x][y] == pc){
                    image[x][y] = color;
                    q.offer(new int[]{x,y});
                }


                }
            }
        }

        return image;
    }
}