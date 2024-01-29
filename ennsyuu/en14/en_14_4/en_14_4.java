package en14.en_14_4;

import java.util.Scanner;

public class en_14_4 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.print("1つ目文字列を入力:");
        String x = stdIn.next();
        System.out.print("2つ目文字列を入力:");
        String y = stdIn.next();

        if (x.equals(y)) {
            System.out.println("同じ文字列です");
        } else {
            System.out.println("違う文字列です");
        }
    }
}
