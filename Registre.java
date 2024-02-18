public class Registre{

    private String name;
    private int value;

    public Registre(String name, int value) {
        this.name = name;
        this.value = value;
    }

    public String getName(){
        return this.name;
    }

    public int getValue(){
        return this.value;
    }

    public void setValue(int value){
        this.value = value;
    }

    public void setName(String n){
        this.name = n;
    }
}
