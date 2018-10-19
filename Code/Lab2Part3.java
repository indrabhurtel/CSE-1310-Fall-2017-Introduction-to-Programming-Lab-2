package lab2part3;

/**
 *
 * @author Indra Bhurtel
 */
public class Lab2Part3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        double x1 = 8;
        double y1 = 2;
        double x2 = 2;
        double y2 = 10;
        double x3 = x2, y3 = y1;
        int base = (int)Math.abs(x1 - x2);  // Line 1
        int height = (int)Math.abs(y1 - y2);  // Line 2
        double hypotenuse = Math.sqrt(Math.pow(base, 2) + Math.pow(height, 2));
        double area;
        area = 0.5 * base * height;      //  Line 3 - Look up the formula for area and insert it here

        System.out.printf("The base is length %d and the height is %3d \n", base, height);
        System.out.print("The distance between (" + x1 + "," + y1 + ") and");
        System.out.printf("(%.0f,%2.0f) is the hypotenuse: %4.1f \n\n", x2, y2, hypotenuse);

        System.out.print("The vertices of the triangle are : ");
        System.out.print(" (" + x1 + "," + y1 + "), ");
        System.out.print(" (" + x2 + "," + y2 + "), and ");
        System.out.print(" (" + x3 + "," + y3 + ")\n\n");
        System.out.println("The area of the right triangle is " + area + "\n");
        double perimeter = base + height + hypotenuse;       // Line 4 - Insert correct calculation here and other as needed
        System.out.println("The perimeter of the right triangle is " + perimeter);

    }
}
