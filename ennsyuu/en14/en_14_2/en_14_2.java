package en14.en_14_2;

import java.util.Scanner;

public class en_14_2 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.print("文字列を入力:");
        String x = stdIn.nextLine();
        int num =x.length();
        System.out.println("入力された文字数は"+num+"です。");
    }
}
