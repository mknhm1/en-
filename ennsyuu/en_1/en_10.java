package en_1;
import java.util.Scanner;
public class en_10 {
    public static void main(String[ ]args){
        Scanner stdIn=new Scanner(System.in);
        System.out.print("お名前を入力してください>");
        String str = stdIn.next();
        System.out.println("こんにちは"+str+"さん!");
    }
}
