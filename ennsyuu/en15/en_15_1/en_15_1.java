package en15.en_15_1;

import java.util.Scanner;

class Calculator {

    float divide(int x, int y) {
        // ifでyが0の場合ArithmeticExceptionをスローする
        if (y == 0) {
            // throw　例外を意図的に起こせる処理
            // ArithmeticException　計算エラー
            throw new ArithmeticException("0による割り算です!!");
        }
        // ない場合
        // 割り算の結果を返す
        return  (float) x / y;
    }
}

public class en_15_1 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("整数を入力してください: ");
        // xに入力させる
        int x = Integer.parseInt(stdIn.nextLine());

        System.out.print("整数を入力してください: ");
        // yに入力させる
        int y = Integer.parseInt(stdIn.nextLine());

        Calculator calculator = new Calculator();
        // 例外処理
        // ArithmeticExceptioをキャッチした場合メッセージを出力
        try {
            //class Calculatorのdivid
            float result = calculator.divide(x, y);
            //計算結果を出力
            System.out.println(x + "/" + y + " = " + result);
            // yが0の場合catch
        } catch (ArithmeticException e) {
            // メッセージを出力
            System.out.println(e.getMessage());
        }
        // 処理終了
        System.out.println("処理終了");
    }
}










// package en15.en_15_1;

// import java.util.Scanner;

// class Calculator {
//     float divide(int x, int y) {
//         float result = (float) x / y;
//         return result;
//     }
// }

// public class en_15_1 {
//     public static void main(String[] args) {
//         Scanner stdIn = new Scanner(System.in);

//         System.out.print("整数を入力してください: ");
//         int x = Integer.parseInt(stdIn.nextLine());

//         System.out.print("整数を入力してください: ");
//         int y = Integer.parseInt(stdIn.nextLine());

//         Calculator calculator = new Calculator();
//         float result = calculator.divide(x, y);

//         System.out.println(x + "/" + y + " = " + result);
//         System.out.println("処理終了");
//     }
// }
