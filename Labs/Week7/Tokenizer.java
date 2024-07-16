package Week7;

import java.util.Arrays;
import java.util.HashMap;

public class Tokenizer {
    private String[] tokens = {};

    public Tokenizer(){}

    public Tokenizer(String fname){
        tokensFromFile(fname);
    }

    public void tokensFromFile(String fname){
        In file = new In(fname);
        String fileLines = file.readAll();
        tokenize(fileLines);
    }

    public void tokenize(String str){
        tokens = str.split("\\W+");
    }

    public String[] getTokens(){
        return tokens;
    }

    public int getNumberTokens(){
        return tokens.length;
    }

    public static void main(String[] args) {
        Tokenizer t0 = new Tokenizer("C:\\Users\\nanna\\IdeaProjects\\INF1B\\src\\Week7\\melville-moby_dick.txt");
        String[] tokens0 = t0.getTokens();
        System.out.println(Arrays.toString(tokens0));
    }

}
