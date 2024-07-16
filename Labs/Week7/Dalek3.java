package Week7;

import java.util.ArrayList;

public class Dalek3 {
    private ArrayList<String> saying = new ArrayList<>();
    public void setSayings(String[] sayings){
        for (String says : sayings) {
            this.saying.add(says);
        }
    }
    public void addSaying(String s){
        saying.add(s);
    }

    public void speak(){
        if(saying.size()>0) {
            int randomIndex = (int) (Math.random() * (saying.size()));
            System.out.println(saying.get(randomIndex));
        }
        else System.out.println("No utterances installed!");
    }

    public static void main(String[] args) {

        Dalek3 d1 = new Dalek3();
        String[] u1 = { "Exterminate, Exterminate!", "I obey!",
                "Exterminate, annihilate, DESTROY!", "You cannot escape.",
                "Daleks do not feel fear.", "The Daleks must survive!" };
        d1.setSayings(u1);

        System.out.println("\nDalek d1 says: ");
        for (int i = 0; i < 10; i++) {
            d1.speak();
        }

        System.out.println("\nDalek d2 says: ");
        Dalek3 d2 = new Dalek3();
        String[] u2 = { "I obey!" };
        d2.setSayings(u2);

        for (int i = 0; i < 10; i++) {
            d2.speak();
        }

    }
}
