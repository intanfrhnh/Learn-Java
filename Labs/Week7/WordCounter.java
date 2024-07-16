package Week7;

import java.util.HashMap;

public class WordCounter {
    private HashMap<Integer, Integer> freqDist = new HashMap<>();
    public WordCounter(String[] tokens){
        wordLengthFreq(tokens);
    }

    public void wordLengthFreq(String[] tokens){
        freqDist.clear();
        for (String token:tokens) {
            Integer tokenLength = token.length();
            Integer count = freqDist.get(tokenLength);
            if(count == null) {
                freqDist.put(tokenLength, 1);
            }
            else{
                freqDist.put(tokenLength, count + 1);
            }
        }
    }

    public HashMap<Integer, Integer> getFreqDist(){
        return freqDist;
    }

    public int maxVal(){
        int max = 0;
        for(int i : freqDist.values()){
            if(i>max){
                max = i;
            }
        }
        return max;
    }

    public double[] map2array(){
        if(freqDist.size() == 0){
            return new double[]{};
        }

        int maximumKey = -1;
        for (int i : freqDist.keySet()){
            if (i>maximumKey){
                maximumKey = i;
            }
        }

        double[] points = new double[maximumKey+1];

        int maximumValue = maxVal();

        for(int i=0; i< points.length; i++){
            Integer frequency = freqDist.get(i);
            if(frequency == null){
                points[i] = 0;
            }
            else{
                points[i] = ((double) frequency)/ maximumValue*100;
            }
        }
        return points;
    }

    public static void main(String[] args) {
        Tokenizer tokenizer = new Tokenizer("melville-moby_dick.txt");
        String[] tokens = tokenizer.getTokens();

        WordCounter wordCounter = new WordCounter(tokens);
        System.out.println(wordCounter.getFreqDist());
        double[] points = wordCounter.map2array();

        int n = points.length;
        StdDraw.clear();
        StdDraw.setXscale(0, n - 1);
        StdDraw.setYscale(0, 100);
        StdDraw.setPenRadius(0.5 / n);
        for (int i = 0; i < n; i++) {
            StdDraw.line(i, 0, i, points[i]);
        }
    }
}
