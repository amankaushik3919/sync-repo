class Solution {
    public int countNegatives(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int count = 0;
        int row = rows - 1;
        int col = 0;

        while (row >= 0 && col < cols) {
            if (grid[row][col] < 0) {
                count += (cols - col); // all elements to the right are negative
                row--; // move up to the previous row
            } else {
                col++; // move right to the next column
            }
        }

        return count;
    }
}
