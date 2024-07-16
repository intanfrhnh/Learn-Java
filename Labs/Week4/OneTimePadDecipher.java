package Week4;

public class OneTimePadDecipher {
    public static String decipher(String encipheredText, String onetimepad){
        int[] originalint2 = new int[encipheredText.length()];
        int[] onetimepadint2 = new int[onetimepad.length()];
        String plaintext = "";

        for (int i = 0; i < encipheredText.length(); i++){ //changing original(plaintext) to int
            originalint2[i] = OneTimePadEncipher.charToInt(encipheredText.charAt(i));
        }

        for (int i = 0; i < onetimepad.length(); i++){ //changing onetimepad(key) to int
            onetimepadint2[i] = OneTimePadEncipher.charToInt(onetimepad.charAt(i));
        }

        for (int i = 0; i < originalint2.length; i++){
            int sum = 0;
            if(originalint2[i] != 26){
                sum =  originalint2[i] - onetimepadint2[i];
                if(sum <0) {
                    sum = sum+26;
                    plaintext = plaintext + Character.toUpperCase(OneTimePadEncipher.intToChar(sum % 26));
                }
                else plaintext = plaintext + Character.toUpperCase(OneTimePadEncipher.intToChar(sum % 26));
            }
            else plaintext = plaintext + Character.toUpperCase(OneTimePadEncipher.intToChar(26));
        }
        return plaintext;
    }

    public static void main(String[] args){
        System.out.println(decipher("uvufsghktdal","WHATSTHEPASSWORD"));
    }
}
