package Week7;

public class Interval {
    public double left;
    public double right;

    public Interval(double left, double right){
        this.left = left;
        this.right = right;
    }

    public boolean doesContain(double x){
        if(!isEmpty()){
            if(this.left <= x && x <= this.right){
                return true;
            }
        }
        return false;
    }

    public boolean isEmpty(){
        if(this.left>this.right){
            return true;
        }
        return false;
    }

    public boolean intersects(Interval b){
        if (!isEmpty()){
            return doesContain(b.left) || doesContain(b.right);
        }
        return false;
    }

    public String toString(){
        if (!isEmpty()){
            return "Interval: [" + left +", "+right+"]" ;
        }
        return "Interval: (EMPTY)";
    }
}
