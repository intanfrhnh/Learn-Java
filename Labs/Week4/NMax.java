package Week4;

import java.util.Scanner;

public class NMax {
    public static int max(int a, int b, int c){
        return Math.max(Math.max(a,b),c);
    }

    public static double max(double a, double b, double c){
        return Math.max(Math.max(a,b),c);
    }

    public static void main(String[] args){
        Scanner StdIn = new Scanner(System.in);
        int a = StdIn.nextInt();
        int b = StdIn.nextInt();
        int c = StdIn.nextInt();

        System.out.println(max(a,b,c));
    }
}
