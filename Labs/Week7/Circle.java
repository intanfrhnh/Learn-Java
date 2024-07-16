package Week7;

public class Circle {
    public Point2DDouble centre;
    public double radius;
    public Circle(Point2DDouble centre, double radius){
        this.centre = centre;
        this.radius = radius;
    }

    public Circle(){
        this.centre = new Point2DDouble(0,0);
        this.radius = 1;
    }

    public boolean isPointInside(Point2DDouble pt){
        double distance = Point2DDouble.distance(centre,pt);
        return distance<radius;
    }

}
