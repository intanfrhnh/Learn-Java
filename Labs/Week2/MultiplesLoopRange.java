package Week2;

public class MultiplesLoopRange {
    public static void main(String[] args) {
        int start = Integer.parseInt(args[0]);
        int end = Integer.parseInt(args[1]);
        int factor = Integer.parseInt(args[2]);
        
        if(start<end){
            for(int i=start; i<=end; i++){
                if(i%factor == 0){
                    System.out.print(i + " ");
                }
            }
            System.out.println("");
        }
        else if(start>end){
            for(int i=start; i>=end; i--){
                if(i%factor == 0){
                    System.out.print(i + " ");
                }
            }
            System.out.println("");
        }
    }
}
