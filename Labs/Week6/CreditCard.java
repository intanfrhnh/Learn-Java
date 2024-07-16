package Week6;


import java.util.Calendar;

public class CreditCard {
    private int expiryMonth;
    private int expiryYear;
    private String firstName;
    private String lastName;
    private String ccNumber;
    static Calendar now = Calendar.getInstance();

    public CreditCard(int expiryMonth, int expiryYear, String firstName, String lastName, String ccNumber ){
        this.expiryMonth = expiryMonth;
        this.expiryYear = expiryYear;
        this.firstName = firstName;
        this.lastName = lastName;
        this.ccNumber = ccNumber;
    }

    public String formatExpiryDate(){
        return expiryMonth+"/"+(Integer.toString(expiryYear).substring(2,4));
    }

    public String formatFullName(){
        return firstName+" "+lastName;
    }

    public String formatCCNumber(){
        String first = ccNumber.substring(0,4);
        String second = ccNumber.substring(4,8);
        String third = ccNumber.substring(8,12);
        String last = ccNumber.substring(12,16);
        return first+" "+second+" "+third+" "+last;
    }

    public boolean isValid(){
        if (now.get(Calendar.YEAR)<expiryYear){
            return true;
        }
        else if (now.get(Calendar.YEAR) == expiryYear){
            return now.get(Calendar.MONTH)+1 <expiryMonth;
        }
        return false;
    }

    public String toString(){
        return  "Number: " + formatCCNumber() + "\n" +
                "Expiration date: " + formatExpiryDate()+ "\n" +
                "Account holder: " + formatFullName() + "\n" +
                "Is valid: " + isValid();
    }

    public static void main(String[] args){
        System.out.println(now.get(Calendar.MONTH)+1);
    }
}
