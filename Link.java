public class Link {
    private final int ID;
    private final Grid grid;

    public Link(int ID, Grid grid) {
        this.ID = ID;
        this.grid = grid;
    }

    public int getID() {
        return ID;
    }

    public Grid getGrid() {
        return grid;
    }


}
