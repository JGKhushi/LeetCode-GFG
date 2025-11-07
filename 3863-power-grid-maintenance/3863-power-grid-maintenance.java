class Solution {

    private void dfs(int node , Map<Integer , List<Integer>> adj , int id , int[] nodeId , Map<Integer , TreeSet<Integer>> mp , boolean[] visited){
        visited[node] = true; 
        mp.computeIfAbsent(id , k-> new TreeSet<>()).add(node);
        nodeId[node] = id ; 

        for(int ngbr  : adj.getOrDefault(node , new ArrayList<>())){
            if(!visited[ngbr]){
                dfs(ngbr, adj , id , nodeId , mp , visited);
            }
        }
    }

    public int[] processQueries(int c, int[][] connections, int[][] queries) {
        Map<Integer,List<Integer>> adj = new HashMap<>();
        for(int[] edge : connections){
             int u = edge[0];
             int v = edge[1];
             adj.computeIfAbsent(u , k -> new ArrayList<>()).add(v);
             adj.computeIfAbsent(v , k -> new ArrayList<>()).add(u);
        }

        boolean[] visited = new boolean[c+1] ; 
        int[] nodeId = new int[c+1];

        Map<Integer , TreeSet<Integer>> mp = new HashMap<>() ; 

        for(int node = 1 ; node <= c ; node++){
            if(!visited[node]){
                int id = node ;
                dfs(node , adj , id , nodeId , mp , visited);
            }
        }

        List<Integer> result = new ArrayList<>();

        for(int[] query : queries){
            int type = query[0];
            int node = query[1];
            int id = nodeId[node];

            if(type == 1 ){
                TreeSet<Integer> set = mp.get(id);
                if(set != null && set.contains(node)){
                    result.add(node);
                }else if(set != null  && !set.isEmpty()){
                    result.add(set.first());
                }else{
                    result.add(-1);
                }
            }else{
                TreeSet<Integer> set = mp.get(id);
                if(set != null){
                    set.remove(node);
                }
            }
        }

        return result.stream().mapToInt(i-> i).toArray();
    }
}