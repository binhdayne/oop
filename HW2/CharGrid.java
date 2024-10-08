// HW1 2-d array Problems
// CharGrid encapsulates a 2-d grid of chars and supports
// a few operations on the grid.

public class CharGrid {
    private char[][] grid;

    /**
     * Constructs a new CharGrid with the given grid.
     * Does not make a copy.
     * @param grid
     */
    public CharGrid(char[][] grid) {
        this.grid = grid;
    }

    /**
     * Returns the area for the given char in the grid. (see handout).
     * @param ch char to look for
     * @return area for given char
     */
    public int charArea(char ch) {
        int up = grid.length, down = 0, left = grid[0].length, right = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == ch) {
                    if (i<=up) up=i;
                    if (i>=down) down=i;
                    if (j<=left) left=j;
                    if (j>=right) right=j;
                }
            }
        }
        return (down-up+1)*(right-left+1); // YOUR CODE HERE
    }

    /**
     * Returns the count of '+' figures in the grid (see handout).
     * @return number of + in grid
     */
    public int countPlus() {
        int count = 0;
        for (int i = 1; i < grid.length - 1; i++) {
            for (int j = 1; j < grid[i].length - 1; j++) {
                if (grid[i][j] == grid[i - 1][j] && grid[i][j] == grid[i + 1][j] && grid[i][j] == grid[i][j - 1] && grid[i][j] == grid[i][j + 1]) {
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        char[][] grid = new char[][] {
                {' ', 'p', ' ' ,' '},
                {' ', 'p', ' ' ,'x'},
                {'p', 'p', 'p', 'p', 'p'},
                {' ', 'p', ' ', 'y', 'x'},
                {' ', 'p', ' ', 'y', 'y', 'y'},
                {'z', 'z', 'z', 'z', 'y', 'z', 'z', 'z'},
                {' ', ' ', 'x', ' ', 'y', ' '},
        };
        CharGrid charGrid = new CharGrid(grid);
        int area = charGrid.countPlus();
        System.out.println(area);
    }
}
