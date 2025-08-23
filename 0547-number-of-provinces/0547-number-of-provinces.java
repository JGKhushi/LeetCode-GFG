class Solution {
    public static void dfs( Map<Integer, ArrayList<Integer> >  mp , int j , boolean[] vis){
        vis[j] = true;
        for(Integer n : mp.get(j)){
             if(!vis[n]){
            dfs(mp , n , vis );
             }
        }
    }
    public int findCircleNum(int[][] isConnected) {
        Map<Integer, ArrayList<Integer> > mp = new HashMap<>();
        int V = isConnected.length ; 

        for(int i = 0 ;i< V ; i++){
            mp.put(i , new ArrayList<Integer>());
        }
        for(int i = 0 ; i< isConnected.length ; i++){
            for(int j = 0 ; j< V ; j++){
                if(isConnected[i][j] == 1 && i != j){
                    mp.get(i).add(j);
                    mp.get(j).add(i);
                }
            }
        }

        boolean[] vis = new boolean[V];
        int cnt = 0 ;

        for(int i = 0 ; i< V ; i++){
            if(!vis[i]){
                cnt++;
                dfs(mp ,i , vis );
            }
        }


    return cnt;

    }
}