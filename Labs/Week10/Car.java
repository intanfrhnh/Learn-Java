package Week10;
import java.util.Objects;

public class Car implements Comparable<Car>{
    private int speed;
    private final int maxSpeed;

    public Car(int maxSpeed){
        if (maxSpeed < 0){
            throw new IllegalArgumentException("Given maximum speed must not be negative but is: " + maxSpeed);
        }
        this.maxSpeed = maxSpeed;
    }

    public int getSpeed(){
        return speed;
    }

    public void gas(int delta){
        speed += delta;
        if(speed>maxSpeed){
            speed = maxSpeed;
        }
        if(speed < 0){
            speed = 0;
        }
    }

    @Override
    public int compareTo(Car that) {
        Objects.requireNonNull(that, "The given Car instance must not be null");
        if(that.speed<this.speed){
            return 1;
        }
        else if(this.speed<that.speed){
            return -1;
        }
        return 0;
    }
}
