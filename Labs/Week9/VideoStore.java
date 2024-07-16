package Week9;

import java.util.ArrayList;

public class VideoStore {
    private ArrayList<Video> inventory = new ArrayList<>();

    public boolean addVideo(String title){
        for(Video video : inventory) {
            if (video.getTitle().equals(title)) {
                System.out.println(title + " is already in stock.");
                return false;
            }
        }
        inventory.add(new Video(title));
        return true;
    }

    public Video getVideo(String title){
        for(Video video : inventory) {
            if (video.getTitle().equals(title)) {
                return video;
            }
        }
        System.out.println("Sorry, cannot find the requested video in the catalogue");
        return null;
    }

    public boolean checkOutVideo(String title){
        if(getVideo(title) == null){
            return false;
        }
        return getVideo(title).checkOut();
    }

    public boolean returnVideo(Video video){
        if (inventory.contains(video)) {
            return video.returnToStore();
        }
        System.out.println("Sorry, this video did not come from this store");
        return false;
    }

    public void rateVideo(Video video, int rating){
        video.addRating(rating);
    }

    public double getAverageRatingForVideo(Video video){
        return video.getAverageRating();
    }

    public Video[] getCheckedOut(){
        ArrayList<Video> checkedOutVideo = new ArrayList<>();
        for(Video video : inventory){
            if(video.isCheckedOut()){
                checkedOutVideo.add(video);
            }
        }
        return checkedOutVideo.toArray(new Video[checkedOutVideo.size()]);
    }

    public Video mostPopular(){
        Video bestVideo = null;
        double highestRating = 0;
        for (Video video:inventory) {
            double rating = video.getAverageRating();
            if(rating>highestRating){
                bestVideo = video;
                highestRating = rating;
            }
        }
        return bestVideo;
    }
}
