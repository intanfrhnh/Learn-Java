package Week4;

public class ErrorHandlingException {

    public static String lowerAndTrim(String input){
        if(input == null){
            throw new NullPointerException("The given input must not be null.");
        }
        return input.trim().toLowerCase();
    }

    public static void formatText(String[] inputs){
        int count = 0;
        for (String string : inputs) {
            try {
                System.out.println(lowerAndTrim(string));
            } catch (NullPointerException e) {
                count ++;
            }
        }
        System.out.println(count);
    }
    
}
