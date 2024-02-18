public class Grid {
    private final int size;
    private int[][] grid;
    private final int[] links;

    public Grid(int size) {
        this(size, 0, 0);
    }

    public Grid(int size, int linkIn, int linkOut) {
        this.size = size;
        this.grid = new int[size][size];
        this.links = new int[2];
    }

    public int[] getLinks(){
        return links;
    }

    public int getSize() {
        return size;
    }

    public int[][] getGrid(){
        return grid;
    }

    public int get(int x, int y) {
        return grid[x][y];
    }

    public void set(int x, int y, int value) {
        grid[x][y] = value;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(grid[i][j] + "\t");
            }
            System.out.println();
        }
    }
    
}
