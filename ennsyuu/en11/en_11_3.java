// package ennsyuu.en11;

//     class OperationExecution {
//         int x;
//         int y;

//         // メソッドで合計値を求める
//         static int Sum() {
//             int sum = 0;
//             for (int i = x; i <= y; i++) {
//                 sum += i;
//             }
//             return sum;
//         }
//     }


// public class en_11_3 {
//     public static void main(String[] args) {
//         // x と y に値を代入
//         OperationExecution obj= new OperationExecution();
//         obj.x=100;
//         obj.y=100;

//         // 合計値を求めるメソッドを呼び出し
//         int result = OperationExecution.Sum();

//         // 結果を表示
//         System.out.println("合計値: " + result);
//     }
// }

package en11;

class OperationExecution {
    int x;
    int y;

    // メソッドで合計値を求める
    int Sum() {
        int sum = 0;
        for (int i = x; i <= y; i++) {
            sum += i;
        }
        return sum;
    }
}


public class en_11_3 {
    public static void main(String[] args) {
        // Create an instance of OperationExecution
        OperationExecution obj = new OperationExecution();

        // Set values for x and y
        obj.x = 100;
        obj.y = 200;

        // Call the non-static method on the instance
        int result = obj.Sum();

        // Display the result
        System.out.println("合計値: " + result);
    }
}

// public class en_11_3 {
//     public static void main(String[] args) {
//         // x と y に値を代入
//         OperationExecution obj = new OperationExecution();
//         obj.x = 100;
//         obj.y = 200;

//         // 合計値を求めるメソッドを呼び出し
//         int result = obj.calculateSum();

//         // 結果を表示
//         System.out.println("合計値: " + result);
//     }
// }
