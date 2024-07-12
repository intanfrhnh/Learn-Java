package Week3;

public class Mode {
    public static void main(String[] args){
        int n = args.length;
        int[] dataset = new int[n];

        //initialise count
        int[] count = new int[10];

        //counting
        for(int i = 0; i <= n-1; i++){
            dataset[i] = Integer.parseInt(args[i]);
            count[dataset[i]]++;
        }

        //finding which number has the highest count
        int maxIndex = 0;
        for(int b = 0; b<= count.length-1; b++){
            if(count[b] > count[maxIndex]){
                maxIndex = b;
            }
        }

        //print out the result
        for(int a = 0; a<= count.length-1; a++){
            String counts = "["+a+"s:"+" "+count[a]+"]";
            if (count[a] != 0){
                counts = counts + " ";
            }
            for (int b = 0; b <= count[a]-1; b++){
                counts = counts + ".";
            }
            System.out.println(counts);
        }

        //Print out the mode
        System.out.println("Mode: " + maxIndex);

    }
}
