package Week9.logic;

public class NotWff extends Wff{
    private final Wff VAR;
    public NotWff(Wff var){
        this.VAR = var;
    }

    public boolean eval(Valuation val){
        return !VAR.eval(val);
    }
    @Override
    public String toString() {
        return String.format("~%s",VAR);
    }
}
