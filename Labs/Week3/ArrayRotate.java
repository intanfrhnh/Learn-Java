package Week3;

public class ArrayRotate {
    public static void main(String[] args){
        int n = args.length;
        int[] num = new int[n];
        int[] copy = new int[n];

        for(int i = 0; i <= args.length -1 ; i++){
            num[i] = Integer.parseInt(args[i]);
        }

        for(int a = 0; a <= num.length-1; a++){
            copy[num.length-1] = num[0];
            if(a<num.length - 1) {
                copy[a] = num[a + 1];
            }
        }

        for(int b : copy){
            System.out.print(b + " ");
        }
    }
}
