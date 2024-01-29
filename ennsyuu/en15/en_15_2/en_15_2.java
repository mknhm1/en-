// package en15.en_15_2;

// import java.util.Scanner;

// class Calculator {

//     String checkEven(float x) {
//         // ifでxが偶数の場合、文字列を返す
//         if (x % 2 == 0) {

//             return x + "は偶数です";
//         }
//         else if(x % 2 == 1){
//             // xが奇数の場合、文字列を返す
//             return x + "は奇数です";
//         }
//         else{} throw new ArithmeticException("整数と認識できません!!");
//     }
// }


// public class en_15_2 {
//     public static void main(String[] args) {
//         Scanner stdIn = new Scanner(System.in);

//         System.out.print("整数を入力してください: ");
//         // xに入力させる
//         float x = Integer.parseInt(stdIn.nextLine());

//         Calculator calculator = new Calculator();
//         // 例外処理
//         // ArithmeticExceptioをキャッチした場合メッセージを出力
//         try {
//             //class Calculatorのdivid
//             String y = calculator.checkEven(x);
//             System.out.println(y);
//         } catch (ArithmeticException e) {
//             // メッセージを出力
//             System.out.println(e.getMessage());
//         }
//         // 処理終了
//         // System.out.println("処理終了");
//     }
// }




package en15.en_15_2;

import java.util.Scanner;

class Calculator {

    String checkEven(float x) {
        // Check if x is an integer
        if (x % 1 == 0) {
            // If x is an integer, then check if it's even or odd
            if (x % 2 == 0) {
                return x + "は偶数です";
            } else {
                return x + "は奇数です";
            }
        } else {
            throw new ArithmeticException("整数と認識できません!!");
        }
    }
}

public class en_15_2 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("実数を入力してください: ");
        // xに入力させる
        float x = Float.parseFloat(stdIn.nextLine());

        Calculator calculator = new Calculator();
        // 例外処理
        // ArithmeticExceptionをキャッチした場合メッセージを出力
        try {
            // class CalculatorのcheckEvenメソッド
            String y = calculator.checkEven(x);
            System.out.println(y);
        } catch (ArithmeticException e) {
            // メッセージを出力
            System.out.println(e.getMessage());
        }
    }
}
