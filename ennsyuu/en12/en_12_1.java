package en12;
import java.util.Scanner;

class Calculator{
    int CalcSum(int x, int y){
        int sum=x+y;
        return sum;
    }
    int CalcAve(int sum){
        int ave=sum/2;
        return ave;
    }
}

class MoreCalc extends Calculator {
    int calcPow(int x, int y) {
        int pow = 1;

        for (int i = 0; i < y; i++) {
            pow *= x;
        }

        return pow;
    }
}


public class en_12_1 {
    public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);
    System.out.print("整数を入力してください:");
    int x = Integer.parseInt(stdIn.nextLine());
    System.out.print("整数を入力してください:");
    int y = Integer.parseInt(stdIn.nextLine());
    MoreCalc mor =new MoreCalc();
    int sum =mor.CalcSum(x, y);
    int ave =mor.CalcAve(sum);
    int pow=mor.calcPow(x, y);
    System.out.println(" Sum "+x+" and "+y+" = "+sum);
    System.out.println(" Averege "+x+" and "+y+" = "+ave);
    System.out.println("Power "+x+" and "+y+" = "+pow);
}
}