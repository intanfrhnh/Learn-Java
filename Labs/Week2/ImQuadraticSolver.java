package Week2;

public class ImQuadraticSolver {
    public static void main(String[] args){
        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
        double c = Double.parseDouble(args[2]);

        double discriminant = b*b - 4*a*c ;

        //root for real
        double realroot1 =(-b + Math.sqrt(discriminant))/2*a ;
        double realroot2 =(-b - Math.sqrt(discriminant))/2*a ;

        //root for imaginary
        double real = -b/2*a ;
        double imaginary = (Math.sqrt(Math.abs(discriminant)))/2*a ;
        String imroot1 = real + " + " + imaginary + "i";
        String imroot2 = real + " - " + imaginary + "i";

        //root for a=0
        double root = -c/b;

        if (a == 0){
            System.out.println(root);

        }
        else if(discriminant >= 0){
            System.out.println(realroot1);
            System.out.println(realroot2);
        }
        else {
            System.out.println(imroot1);
            System.out.println(imroot2);
        }
    }
}
