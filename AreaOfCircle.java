
/*Calculate tha area of a circle*/
import java.util.Scanner;

class AreaOfCircle {
    public static void main(String args[]) {

        Scanner ref = new Scanner(System.in);

        System.out.println("Radius: ");
        double rad = ref.nextDouble();
        double area = 3.14 * rad * rad;
        System.out.println("Area of the circle: " + area);

    }
}