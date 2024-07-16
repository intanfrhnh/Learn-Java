package Week9;

import java.util.ArrayList;

public class Video {
    private static final boolean CHECKED_OUT = true;
    private static final boolean NOT_CHECKED_OUT = false;

    private String title;
    private boolean checkOutStatus;
    private ArrayList<Integer> ratings = new ArrayList<>();

    public Video(String title){
        this.title  = title;
    }

    public String getTitle(){
        return title;
    }

    public boolean addRating(int rating){
        if(1 <= rating && rating <= 5){
            this.ratings.add(rating);
            return true;
        }
        else{
            System.out.printf("%d should be between 1 and 5.\n",rating);
        }
        return false;
    }

    public double getAverageRating(){
        if(!ratings.isEmpty()){
            double totalRating = 0;
            for (Integer integer : ratings) {
                totalRating+= integer;
            }
            return totalRating/ratings.size();
        }
        return 0.0;
    }

    public boolean checkOut(){
        if(checkOutStatus == CHECKED_OUT){
            System.out.printf("Video[title=\"%s\", checkedOut=%s] is already checked out.",title,checkOutStatus);
            return false;
        }
        else{
            checkOutStatus = CHECKED_OUT;
        }
        return true;
    }

    public boolean returnToStore(){
        if(checkOutStatus == NOT_CHECKED_OUT){
            System.out.printf("Video[title=\"%s\", checkedOut=%s] is not checked out.",title,checkOutStatus);
            return false;
        }
        else{
            checkOutStatus = NOT_CHECKED_OUT;
        }
        return true;
    }

    public boolean isCheckedOut(){
        return checkOutStatus;
    }

    public String toString(){
        return String.format("Video[title=\"%s\", checkedOut=%s]",title,checkOutStatus);
    }


}
