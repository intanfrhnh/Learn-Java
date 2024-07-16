package Week6;

import java.util.Arrays;

public class Favourites {
    private MusicTrack[] favourite = {};
    public void addTrack(String artist, String title){
        if(favourite.length<5) {
            favourite = Arrays.copyOf(favourite, favourite.length + 1);
            favourite[favourite.length-1] = new MusicTrack(artist,title);
        }
        else{
            System.out.println ("Sorry, can't add: "+new MusicTrack(artist,title)+"\n");
        }
    }

    public void showFavourites(){
        if(favourite.length>0){
            for(MusicTrack track : favourite){
                System.out.println(track);
            }
        }
        else System.out.println("");
    }

    public static void main(String[] args){
        Favourites favourites = new Favourites();
        favourites.addTrack("Fun", "Some Nights");
        favourites.addTrack("Oliver Tank", "Help You Breathe");
        favourites.addTrack("Horse Feathers", "Fit Against the Country");
        favourites.addTrack("Emile Sande", "Country House");
        favourites.addTrack("Fun", "Walking the Dog");
        favourites.addTrack("Porcelain Raft", "Put Me To Sleep");
        favourites.showFavourites();
    }
}
