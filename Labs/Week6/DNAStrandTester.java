package Week6;

public class DNAStrandTester {
    public static void summarise(DNAStrand dna){
        System.out.println("Original DNA Sequence: " + dna);
        if (dna.isValidDNA()){
            System.out.println("Is Valid");
            System.out.println("Complement: " + dna.complementWC());
            System.out.println("WC Palindrome: " + dna.palindromeWC());
        }
        else System.out.println("Not Valid DNA");
    }

    public static void main(String[] args){
        DNAStrand dna1 = new DNAStrand("abualiahtong");
        DNAStrand dna2 = new DNAStrand("ABG");
        System.out.println(dna2.isValidDNA());

    }
}
