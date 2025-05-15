class Solution {
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        // Map: vertical -> level -> list of values at that position
        Map<Integer, Map<Integer, List<Integer>>> nodes = new TreeMap<>();
        
        Queue<Pair<TreeNode, Pair<Integer, Integer>>> queue = new LinkedList<>();
        queue.offer(new Pair<>(root, new Pair<>(0, 0)));
        
        while (!queue.isEmpty()) {
            Pair<TreeNode, Pair<Integer, Integer>> pair = queue.poll();
            TreeNode node = pair.getKey();
            int x = pair.getValue().getKey();
            int y = pair.getValue().getValue();
            
            // Initialize data structure if needed
            nodes.putIfAbsent(x, new TreeMap<>());
            nodes.get(x).putIfAbsent(y, new ArrayList<>());
            
            // Add the value to the list
            nodes.get(x).get(y).add(node.val);
            
            // Process children
            if (node.left != null) {
                queue.offer(new Pair<>(node.left, new Pair<>(x - 1, y + 1)));
            }
            if (node.right != null) {
                queue.offer(new Pair<>(node.right, new Pair<>(x + 1, y + 1)));
            }
        }
        
        // Build the result
        List<List<Integer>> result = new ArrayList<>();
        for (Map<Integer, List<Integer>> column : nodes.values()) {
            List<Integer> mergedColumn = new ArrayList<>();
            for (List<Integer> levelValues : column.values()) {
                // Sort values at the same position
                Collections.sort(levelValues);
                mergedColumn.addAll(levelValues);
            }
            result.add(mergedColumn);
        }
        
        return result;
    }
}