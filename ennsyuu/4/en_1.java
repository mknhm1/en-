import java.util.Scanner;

public class en_1 {
    public static void main(String[] args){
        Scanner stdIn =new Scanner(System.in);
        System.out.print("0~100mでの点数(整数値)を入力してください:");
        int n =stdIn.nextInt();
        if (n>=80){
        System.out.println("合格です");
    }
}
}
