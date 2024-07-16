package Week9.logic;

public abstract class BinaryWff extends Wff {
    private final Wff LEFT;
    private final Wff RIGHT;
    private Operator op;

    public BinaryWff(Wff left, Wff right){
        this.LEFT = left;
        this.RIGHT = right;
    }

    public void setOp(Operator op){
        this.op = op;
    }

    public Operator getOp(){
        return op;
    }

    public Wff getLeft(){
        return LEFT;
    }

    public Wff getRight(){
        return RIGHT;
    }

    public String toString(){
        return String.format("(%s %s %s)",LEFT,op,RIGHT);
    }

}
