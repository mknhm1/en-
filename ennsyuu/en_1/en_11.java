package en_1;

import java.util.Scanner;

public class en_11 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.print("年:");
        String year = stdIn.next();
        System.out.print("月:");
        String month = stdIn.next();
        System.out.print("日:");
        String day = stdIn.next();
        System.out.println(year + "/" + month + "/" + day);
    }
}
