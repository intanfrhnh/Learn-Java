package Week4;

public class ArrayFront9 {
    public static boolean arrayFront9(int[] nums){
        if(nums.length <= 4) {
            for (int a = 0; a <= nums.length - 1; a++) {
                if (nums[a] == 9) {
                    return true;
                }
            }
        }
        else {
            for (int a = 0; a <= 3; a++) {
                if (nums[a] == 9) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public static void main(String[] args){
        int N = args.length;
        int [] nums = new int[N];
        for (int i = 0; i < N; i++ ){
            nums[i] = Integer.parseInt(args[i]);
        }
        System.out.println(arrayFront9(nums));
    }
}
