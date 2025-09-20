import java.util.*;

class Router {

    private Queue<int[]> q; 
    private Set<String> set; 
    private int limit;
    private Map<Integer, List<Integer>> destMap;

    public Router(int memoryLimit) {
        this.limit = memoryLimit;
        this.q = new LinkedList<>();
        this.set = new HashSet<>();
        this.destMap = new HashMap<>();
    }
    
    private String makeKey(int source, int destination, int timestamp) {
        return source + "#" + destination + "#" + timestamp;
    }

    public boolean addPacket(int source, int destination, int timestamp) {
        String key = makeKey(source, destination, timestamp);
        if (set.contains(key)) return false;

        // Remove oldest if memory limit reached
        if (q.size() == limit) {
            int[] old = q.poll();
            String oldKey = makeKey(old[0], old[1], old[2]);
            set.remove(oldKey);

            // Remove timestamp from destMap
            List<Integer> list = destMap.get(old[1]);
            list.remove(0); // first element always oldest
            if (list.isEmpty()) destMap.remove(old[1]);
        }

        // Add new packet
        q.add(new int[]{source, destination, timestamp});
        set.add(key);

        // Update destMap
        destMap.putIfAbsent(destination, new ArrayList<>());
        destMap.get(destination).add(timestamp); // timestamps increasing → list sorted

        return true;
    }
    
    public int[] forwardPacket() {
        if (q.isEmpty()) return new int[0];

        int[] packet = q.poll();
        String key = makeKey(packet[0], packet[1], packet[2]);
        set.remove(key);

        // Remove timestamp from destMap
        List<Integer> list = destMap.get(packet[1]);
        list.remove(0);
        if (list.isEmpty()) destMap.remove(packet[1]);

        return packet;
    }
    
    public int getCount(int destination, int startTime, int endTime) {
        if (!destMap.containsKey(destination)) return 0;
        List<Integer> list = destMap.get(destination);

        // Binary search for startTime
        int left = 0, right = list.size()-1, lIndex=-1;
        while (left <= right) {
            int mid = left + (right-left)/2;
            if (list.get(mid) >= startTime) {
                lIndex = mid;
                right = mid-1;
            } else {
                left = mid+1;
            }
        }
        if (lIndex == -1) return 0;

        // Binary search for endTime
        left = 0; right = list.size()-1;
        int rIndex=-1;
        while (left <= right) {
            int mid = left + (right-left)/2;
            if (list.get(mid) <= endTime) {
                rIndex = mid;
                left = mid+1;
            } else {
                right = mid-1;
            }
        }

        if (rIndex == -1) return 0;
        return rIndex - lIndex + 1;
    }
}
