public class Code {
    private final Instruction instruction;
    private final Robot robot;

    public Code(Instruction instruction, Robot robot) {
        this.instruction = instruction;
        this.robot = robot;
    }

    public Instruction getInstruction() {
        return instruction;
    }

    public Robot getRobot() {
        return robot;
    }

    public void execute(){

    }


    //COPY
    public void copy(Registre  source, Registre  dest){
        dest.setValue(source.getValue());
    }

    public void copy(int source, Registre dest){
        dest.setValue(source);
    }

    //ADDI
    public void add(int op1, int op2, Registre dest){
        dest.setValue(op1 + op2);
    }

    public void add(Registre op1, int op2, Registre dest){
        dest.setValue(op1.getValue() + op2);
    }

    public void add(int op1, Registre op2, Registre dest){
        dest.setValue(op2.getValue() + op1);
    }

    public void add(Registre op1, Registre op2, Registre dest){
        dest.setValue(op1.getValue() + op2.getValue());
    }

    //MULI
    public void mul(int op1, int op2, Registre dest){
        dest.setValue(op1 * op2);
    }

    public void mul(Registre op1, int op2, Registre dest){
        dest.setValue(op1.getValue() * op2);
    }

    public void mul(int op1, Registre op2, Registre dest){
        dest.setValue(op2.getValue() * op1);
    }

    public void mul(Registre op1, Registre op2, Registre dest){
        dest.setValue(op1.getValue() * op2.getValue());
    }

     //SUBI
    public void sub(int op1, int op2, Registre dest){
        dest.setValue(op1 - op2);
    }

    public void sub(Registre op1, int op2, Registre dest){
        dest.setValue(op1.getValue() - op2);
    }

    public void sub(int op1, Registre op2, Registre dest){
        dest.setValue(op2.getValue() - op1);
    }

    public void sub(Registre op1, Registre op2, Registre dest){
        dest.setValue(op1.getValue() - op2.getValue());
    }

    //LINK
    public void link(int link){
        int x = link / 5;
        int y = link % 5;
        if (Math.abs(x - robot.getPosX()) <= 1 &&  Math.abs(y - robot.getPosY()) <= 1){
            robot.setPos(link);
            robot.setPosX(x);
            robot.setPosY(y);
        }
    }

    //JUMP
    public void jump(int n){
        
    }

    //FJMP
    public void fjmp(int n){
        
    }

}
