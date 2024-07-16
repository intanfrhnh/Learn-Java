package Week7;

public class Rectangle {
    Point2DDouble topLeft, bottomRight;

    public Rectangle(Point2DDouble topLeft, Point2DDouble bottomRight){
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }

    public Rectangle(){
        this(new Point2DDouble(0,0),new Point2DDouble(1,1));
    }
    public boolean isPointInside(Point2DDouble pt){
        return (topLeft.getX() <= pt.getX() && pt.getX() <= bottomRight.getX()) &&
                (topLeft.getY() < pt.getY() && pt.getY() < bottomRight.getY());
    }
}