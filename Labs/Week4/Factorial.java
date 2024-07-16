package Week4;

public class Factorial {
    public static int factorial(int N){
        if(N == 1){
            return 1;
        }
        else N=N*factorial(N-1);

        return N;
    }

    public static void main(String[] args){
        System.out.println(factorial(4));
    }
}
