package Week4;

public class DateFashion {
    public static int dateFashion(int you, int date){
    int gettingthetable = 1; //default value for maybe
        if((you >= 8 && date <= 2) || (you <= 2 && date >= 8)){
            gettingthetable = 0;
        }
        else if(you >= 8 || date >= 8){
            gettingthetable = 2;
        }
        else if(you <= 2 || date <= 2) {
            gettingthetable = 0;
        }
        return gettingthetable;
    }

    public static void main(String[] args){
        int you = Integer.parseInt(args[0]);
        int date = Integer.parseInt(args[1]);
        System.out.println(dateFashion(you,date));
    }


}