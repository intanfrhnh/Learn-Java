package Week6;

public class Vector3D {
    private double coordinateX;
    private double coordinateY;
    private double coordinateZ;
    public Vector3D(double x, double y, double z){
        this.coordinateX = x;
        this.coordinateY = y;
        this.coordinateZ = z;
    }

    public double getR() { return Math.sqrt(coordinateX*coordinateX + coordinateY*coordinateY + coordinateZ*coordinateZ); }

    public double getTheta() { return Math.acos(coordinateZ/getR()); }

    public double getPhi(){ return Math.atan2(coordinateY,coordinateX); }

    public static Vector3D add(Vector3D lhs, Vector3D rhs){
        double sumX = lhs.coordinateX + rhs.coordinateX;
        double sumY = lhs.coordinateY + rhs.coordinateY;
        double sumZ = lhs.coordinateZ + rhs.coordinateZ;
        return new Vector3D(sumX,sumY,sumZ);
    }

    public static Vector3D subtract(Vector3D lhs, Vector3D rhs){
        double differenceX = lhs.coordinateX - rhs.coordinateX;
        double differenceY = lhs.coordinateY - rhs.coordinateY;
        double differenceZ = lhs.coordinateZ - rhs.coordinateZ;
        return new Vector3D(differenceX,differenceY,differenceZ);
    }

    public static Vector3D scale(Vector3D v, double scaleFactor){
        double scaleX = v.coordinateX*scaleFactor;
        double scaleY = v.coordinateY*scaleFactor;
        double scaleZ = v.coordinateZ*scaleFactor;
        return new Vector3D(scaleX,scaleY,scaleZ);
    }
}
