package Week4;

public class ArrayOps {
    public static double findMax(double[] data){
        double max = data[0];
        for(double num : data){
            if(num > max) max = num;
        }
        return max;
    }

    public static double[] normalise(double data[]){
        double sum = 0;
        double[] newdata = new double[data.length];
        for (double num : data){
            sum = sum + num;
        }
        for (int i=0;i<data.length; i++){
            newdata[i] = data[i]/sum;
        }
        return newdata;
    }

    public static void normaliseInPlace(double data[]){
        double sum = 0;
        for (double num : data){
            sum = sum + num;
        }
        for (int i=0;i<data.length; i++){
            data[i] = data[i]/sum;
        }
    }

    public static double[] reverse(double[] data){
        double[] newdata = new double[data.length];
        for(int i = 0; i<data.length; i++){
            newdata[i] = data[data.length - 1 -i];
        }
        return newdata;
    }

    public static void reverseInPlace(double[] data){
        for(int i = 0; i<data.length/2; i++){
            double placeholder = data[i];
            data[i] = data[data.length - 1 -i];
            data[data.length -1 -i] = placeholder;
        }
    }

    public static void swap(double[] data1, double[] data2){
        for(int i = 0; i<data1.length; i++){
            double placeholder = data1[i];
            data1[i] = data2[i];
            data2[i] = placeholder;
        }
    }

 /*   public static void main(String[] args){
        double[] data = {2,8,4,5,6};
        double[] dataq = {9,7,3,2,1};
        swap(data,dataq);
        System.out.println(Arrays.toString(data));
    }*/
}
