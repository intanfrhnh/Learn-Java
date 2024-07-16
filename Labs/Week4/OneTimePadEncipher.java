package Week4;

import static java.lang.Character.toLowerCase;
import static java.lang.Character.toUpperCase;

public class OneTimePadEncipher {
    static char[] alphabets = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z',' '};
    public static int charToInt(char l){
        int number = 0;
        l = toUpperCase(l);
        for(int i = 0; i < alphabets.length; i++){
            if(l == alphabets[i]){
                number = i;
            }

            else if(l == ' '){
                number = i;
            }
        }
        return number;
    }

    public static char intToChar(int i){
        return toLowerCase(alphabets[i]);
    }

    public static boolean isAlpha(char c){
        return Character.isLetter(c);
    }

    public static String encipher(String original,String onetimepad){
        int[] originalint = new int[original.length()];
        int[] onetimepadint = new int[onetimepad.length()];
        String ciphertext = "";

        for (int i = 0; i < original.length(); i++){ //changing original(plaintext) to int
            originalint[i] = charToInt(original.charAt(i));
        }

        for (int i = 0; i < onetimepad.length(); i++){ //changing onetimepad(key) to int
            onetimepadint[i] = charToInt(onetimepad.charAt(i));
        }

        for (int i = 0; i < originalint.length; i++){
            int sum = 0;
            if(originalint[i] != 26){
                sum =  originalint[i] + onetimepadint[i];
                ciphertext = ciphertext + intToChar(sum%26);
            }
            else ciphertext = ciphertext + intToChar(26);
        }
        return ciphertext;
    }

    public static void main(String[] args){
        System.out.println(encipher("IS THIS SECURE","KEEPMEVERYVERYSAFE"));
    }

}
