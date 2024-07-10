package Week2;

public class SquaresLoopRange {
    public static void main(String[] args) {
        int start = Integer.parseInt(args[0]);
        int end = Integer.parseInt(args[1]);

        if(start<end){
            for(int i=start; i<=end; i++){
                System.out.print(i*i + " ");
            }
            System.out.println("");
        }

        else{
            System.err.println("Start-limit greater than stop-limit!");
        }
    }
}
