package en14.en_14_3;

import java.util.Scanner;

public class en_14_3 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.print("文字列を入力:");
        StringBuilder sb = new StringBuilder(stdIn.next());
        int num = sb.length();
        if (num > 10) {
            sb.delete(10, num);
            System.out.println(sb);
        } else {
            System.out.println(sb);
        }
    }
}
