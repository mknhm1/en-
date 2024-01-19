package ennsyuu.en11;
import java.util.Scanner;

// class Circle {
//     double PI = 3.1415;

//     double circumference(int radius) {
//         double circle = (radius * 2) * PI;
//         return circle;
//     }

//     double area(int radius) {
//         double circleArea = PI * radius * radius;
//         return circleArea;3

//     }
// }

public class en_11_1 {
    public static void main(String[] args) {

        Scanner stdIn = new Scanner(System.in);
        System.out.print("半径を整数値で入力:");
        int num = Integer.parseInt(stdIn.nextLine());
        Circle cl = new Circle();
        double circle = cl.circumference(num);
        double area = cl.area(num);
        System.out.println("円周の長さは" + circle);
        System.out.println("円の面積は" + area);
    }
}
