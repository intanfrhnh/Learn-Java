package Week9.logic;

public class PropVar extends Wff{

    private String propVar;

    public PropVar(String str) {
        this.propVar = str;
    }

    public boolean eval(Valuation val) {
        return val.get(this);
    }

    public String toString() {
        return propVar;
    }

}