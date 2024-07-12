package Week3;

import java.util.Arrays;

public class TempMedian {
    public static void main(String[] args){
        int n = args.length;
        double median = 0;

        int[] temp = new int[n];
        temp[0] = Integer.parseInt(args[0]);
        int firsttemp = temp[0];

        for(int i = 1; i <= n-1 ; i++){
            if(args[i].equals(".")) {
                temp[i] = firsttemp;
                firsttemp = temp[i];
            }
            else if(args[i].equals("+")) {
                temp[i] = firsttemp +1;
                firsttemp = temp[i];
            }
            else if (args[i].equals("-")) {
                temp[i] = firsttemp-1;
                firsttemp = temp[i];
            }
        }
        //print out raw data
        for (int t : temp){
            System.out.print(t + " ");
        }
        System.out.println();

        //Sort data
        Arrays.sort(temp);

        //print out sorted data
        for (int t : temp){
            System.out.print(t + " ");
        }
        System.out.println();

        //Find median
        if((n%2) == 0){
            median = (double) (temp[(n - 1) / 2] + temp[(n - 1) / 2 + 1]) /2;
            System.out.println(median);
        }
        else{
            median = temp[n/2];
            System.out.println(median);
        }
    }
}
