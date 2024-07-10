package Week3;

public class ArithmeticSeries {
    public static void main(String[] args){
        int N = Integer.parseInt(args[0]);
        int i = 0;
        int k = 0;
        while (i <= N){
            k = k + i;
            i++;
        }
        System.out.println(k);
    }
}
