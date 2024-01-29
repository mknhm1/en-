package en14.en_14_3;

import java.util.Scanner;

public class en_14_3 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.println("文字列を入力:");
        String x =stdIn.next();
        int num = x.length();
        if (num > 10) {
            StringBuilder sb = new StringBuilder(x);
            sb.delete(10, num);
            System.out.println(sb);
        } else {
            System.out.println(x);
        }
    }
}
