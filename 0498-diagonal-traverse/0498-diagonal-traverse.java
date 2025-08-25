class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int n = mat.length;        // number of rows
        int m = mat[0].length;     // number of cols
        int ans[] = new int[n*m];  // total elements
        int k = 0;

        // total diagonals = n+m-1
        for (int i = 0; i < n + m - 1; i++) {
            int a, b;

            if (i % 2 == 0) {   // even diagonal → up direction
                a = (i < n) ? i : n - 1;
                b = i - a;
                while (a >= 0 && b < m) {
                    ans[k] = mat[a][b];
                    // System.out.println(a + " " + b);
                    k++;
                    a--;
                    b++;
                }
            } else {           // odd diagonal → down direction
                b = (i < m) ? i : m - 1;
                a = i - b;
                while (a < n && b >= 0) {
                    ans[k] = mat[a][b];
                    // System.out.println(a + " " + b);
                    k++;
                    a++;
                    b--;
                }
            }
        }

        return ans;
    }
}
