class Solution {
    public int numberOfPairs(int[][] points) {
        int n = points.length;
        int count = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) continue;

                int Ax = points[i][0], Ay = points[i][1];
                int Bx = points[j][0], By = points[j][1];

                // Condition 1: A must be on upper-left of B
                if (Ax <= Bx && Ay >= By) {
                    boolean valid = true;

                    // Check if any other point lies inside or on border
                    for (int k = 0; k < n; k++) {
                        if (k == i || k == j) continue;
                        int Cx = points[k][0], Cy = points[k][1];

                        if (Cx >= Ax && Cx <= Bx && Cy >= By && Cy <= Ay) {
                            valid = false;
                            break;
                        }
                    }

                    if (valid) count++;
                }
            }
        }

        return count;
    }
}
