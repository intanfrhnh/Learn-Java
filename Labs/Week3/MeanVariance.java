package Week3;

public class MeanVariance {
    public static void main(String[] args){
        int n = args.length;
        double[] setofnum = new double[n];
        double mean = 0;
        double variance = 0;

        for (int i = 0; i <= n-1; i++){
            setofnum[i] = Double.parseDouble(args[i]);
        }

        for (int a = 0 ; a <= n-1 ; a++){
            mean = mean + setofnum[a];
            if(a == n-1){
                mean = mean/n;
                System.out.println(mean);
            }
        }

        for (int b = 0 ; b <= n-1 ; b++){
            variance = variance + (setofnum[b]-mean)*(setofnum[b]-mean);
            if(b == n-1){
                variance = variance/n;
                System.out.println(variance);
            }
        }

    }
}
