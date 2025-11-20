import java.util.*;

class Solution {
    public int intersectionSizeTwo(int[][] intervals) {
        Arrays.sort(intervals, (x, y) -> Integer.compare(x[1], y[1]));

        int a = -1, b = -1; // a < b, last two chosen distinct numbers
        int res = 0;

        for (int[] it : intervals) {
            int start = it[0], end = it[1];

            boolean aInside = (a >= start);
            boolean bInside = (b >= start);

            if (aInside && bInside) {
                continue; // already satisfied
            }

            if (bInside) {
                // only b inside -> need one more distinct number
                if (b == end) {
                    // b already equals end, so pick end-1
                    a = end - 1;
                    b = end;
                    res += 1;
                } else {
                    // pick end
                    a = b;
                    b = end;
                    res += 1;
                }
            } else {
                // none inside -> pick two: end-1 and end
                a = end - 1;
                b = end;
                res += 2;
            }
        }

        return res;
    }
}
