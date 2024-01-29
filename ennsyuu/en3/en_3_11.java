package en3;

import java.util.Scanner;
public class en_3_11 {
    public static void main(String[ ]args){
        Scanner stdIn=new Scanner(System.in);
        System.out.print("文字列1:");
        String str = stdIn.next();
        System.out.print("文字列2:");
        String str2 = stdIn.next();
        String sum =str+str2;
        System.out.println(sum);
    }
}
