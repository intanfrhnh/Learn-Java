package Week7.music;

import java.util.ArrayList;

public class Favourites {
    private ArrayList<MusicTrack> favourite = new ArrayList<>();
    public void addTrack(String artist, String title){
        favourite.add(new MusicTrack(artist,title));
    }

    public void showFavourites(){
        if(favourite.size()>0){
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
