package Week6;

public class DNAStrand {
    private String dna;
    public DNAStrand(String dna) {this.dna = dna;}


    public boolean isValidDNA() {
        boolean valid = true;
        if(!dna.isEmpty()) {
            for (int i = 0; i < dna.length(); i++) {
                if (Character.isUpperCase(dna.charAt(i))) {
                    switch (dna.charAt(i)) {
                        case 'A':
                        case 'C':
                        case 'T':
                        case 'G':
                            break;
                        default:
                            valid = false;
                    }
                } else valid = false;
            }
        }
        else valid = false;
        return valid;
    }

    public String complementWC(){
        String complement = "";
        for(int i=0; i<dna.length(); i++){
            if(this.dna.charAt(i) == 'A') complement += "T";
            else if(this.dna.charAt(i) == 'T') complement += "A";
            else if(this.dna.charAt(i) == 'C') complement += "G";
            else if(this.dna.charAt(i) == 'G') complement += "C";
            else complement += "";
            }
        return complement;
    }

    public String palindromeWC(){
        String palindrome = "";
        for(int i=dna.length()-1; i>=0; i--){
            palindrome += complementWC().charAt(i);
        }
        return palindrome;
    }

    public boolean containsSequence(String seq){
        return dna.contains(seq);
    }

    public String toString(){
        return dna;
    }
}
