package Week4;

import java.util.Scanner;

public class IsTriangular {
    public static boolean isTri(double a, double b, double c){
        return !(a >= b + c) && !(b >= a + c) && !(c >= b + a);
    }

    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        double a = stdIn.nextDouble();
        double b = stdIn.nextDouble();
        double c = stdIn.nextDouble();

        if(isTri(a,b,c)){
            System.out.printf("%s, %s and %s could be the lengths of a triangle\n",a,b,c);
        }
        else{
            System.out.println("Not a triangle.");
        }
        stdIn.close();
    }
}