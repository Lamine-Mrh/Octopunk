public class Grid {
    private final int size;
    private int[][] grid;
    private final Link link;

    public Grid(int size) {
        this(size, null);
    }

    public Grid(int size, Link link) {
        this.size = size;
        this.grid = new int[size][size];
        this.link = link;
    }

    public Link getLink(){
        return link;
    }

    public int getSize() {
        return size;
    }

    public int[][] getGrid(){
        return grid;
    }

    public int getElem(int x, int y) {
        return grid[x][y];
    }

    public int getElem(int x){
        if(x < 0 || x >= size * size){
            return -1;
        }
        return grid[x / size][x % size];
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
