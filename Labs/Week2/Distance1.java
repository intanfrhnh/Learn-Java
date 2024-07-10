package Week2;

public class Distance1 {
    public static void main(String[] args) {
        int myNumber = Integer.parseInt(args[0]);
        int myNumber2 = Integer.parseInt(args[1]);
        int max = Math.max(myNumber, myNumber2);
        int min = Math.min(myNumber, myNumber2);

        System.out.println(max-min);
    }
}
