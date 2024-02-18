public class Robot {
    private final String name;
    private final Registre X, T;
    private int posX, posY, pos;

    public Robot(String name, Registre X, Registre T, int posX, int posY) {
        this.name = name;
        this.X = X;
        this.T = T;
        this.posX = posX;
        this.posY = posY;
        this.pos = posX * 5 + posY;
    }

    public String getName() {
        return name;
    }

    public Registre getX() {
        return X;
    }

    public Registre getT() {
        return T;
    }

    public int getPosX() {
        return posX;
    }

    public int getPosY() {
        return posY;
    }

    public int getPos(){
        return pos;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }
    public void setPos(int pos){
        this.pos = pos;
    }
}
