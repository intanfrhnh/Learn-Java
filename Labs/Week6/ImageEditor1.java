package Week6;

import java.awt.*;

public class ImageEditor1 {
    public static double luminance(Color color){ return 0.299*color.getRed() + 0.587*color.getGreen() + 0.114* color.getBlue(); }

    public static Color toGrey(Color color){
        int luminance = (int) Math.round(luminance(color));
        return new Color(luminance,luminance,luminance);
    }

    public static Picture makeGreyscale(Picture p){
        Picture pic = new Picture(p.width(),p.height());
        for(int i = 0 ; i < p.width(); i++){
            for(int j = 0 ; j < p.height(); j++){
                pic.set(i,j,toGrey(p.get(i,j)));
            }
        }
        return pic;
    }

    public static void main(String[] args){
        Picture p = new Picture("lion1.jpg"); // or use any other colour image
        Picture greyscale = makeGreyscale(p);
        greyscale.show();
        Picture t = ImageEditor2.threshold(p, 120);
        t.show();
    }
}
