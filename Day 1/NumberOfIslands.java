public class NumberOfIslands {
    public int numberOfIslands(char[][] grid) {
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == '1') {
                    count++;
                    CallDFS(grid, i, j);
                }
            }
        }
        return count;
    }

    public void CallDFS(char[][] grid, int i, int j) {
        if (i < 0 || i > grid.length || j < 0 || j >= grid[i].length) {
            return;
        }
        grid[i][j] = '0';
        CallDFS(grid, i, j + 1);
        CallDFS(grid, i, j - 1);
        CallDFS(grid, i + 1, j);
        CallDFS(grid, i - 1, j);
    }
    public static void main(String[] args) {
        NumberOfIslands noi = new NumberOfIslands();
        char[][] grid = {
            {'1', '1', '0'},
            {'1', '1', '0'}
        };
        noi.numberOfIslands(grid);
    }
}
