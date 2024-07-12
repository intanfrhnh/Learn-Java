package Week3;

public class Sieve {
    public static void main(String[] args) {
        //length of numbers
        int n = 20;
        //start number
        int p = 2;

        //create the array
        int[] sieved_numbers = new int[n-p+1];
        for(int i=0; i<sieved_numbers.length ; i++){
            sieved_numbers[i] = p+i;
        }

        //printing prime numbers
        while(p<n){
            System.out.print(p);
            System.out.print(" ");

            //remove all the multiples
            for(int i=0; i<sieved_numbers.length; i++){
                if(sieved_numbers[i]%p == 0){
                    sieved_numbers[i] = 0;
                }
            }

            //find next p
            boolean found = false;
            for (int i=0; i<sieved_numbers.length && !found; i++){
                if (sieved_numbers[i]>p) {
                    p = sieved_numbers[i];
                    found = true;
                }
            }

            if(!found){
                p = n+1;
            }
            

        }
        System.out.println("");
    }
}
