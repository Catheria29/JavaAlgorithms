package lab2;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.ArrayList;

import static java.lang.Math.round;


public class PolymorphismePratice {
    public static StringBuilder getInfo(ArrayList<Shape> list){
        DecimalFormat df = new DecimalFormat("#.##");
        StringBuilder sb = new StringBuilder("GeeksforGeeks");
        for( Shape x : list ){
            sb.append(x.toString());
            sb.append("\n");
            sb.append("Has area: " + df.format(x.calculateArea()) );
            sb.append("\n");
            sb.append("Has circumference: " + df.format(x.calculateCircumference()) );
            sb.append("\n");
        }
        return sb;

    }
    public static void main(String[] args){
        ArrayList<Shape> shapes = new ArrayList<Shape>();
        for(int i = 0; i < 5; i++){
            shapes.add(new Circle((int)(Math.round((1 + Math.random() * 19) * 100.0) / 100.0),(int)(Math.round((1 + Math.random() * 19) * 100.0) / 100.0),(int)(Math.random() * 20) + 1));
        }
        for(int i = 0; i < 5; i++){
            shapes.add(new Rectangle((int)(Math.round((1 + Math.random() * 19) * 100.0) / 100.0),Math.round((1 + Math.random() * 19) * 100.0) / 100.0,(int)(Math.random() * 20) + 1,(int)(Math.random() * 20) + 1));
        }
        System.out.println(shapes.size());
        System.out.println(getInfo(shapes));

    }
}
