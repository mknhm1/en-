package en11;

// class settlement_execution{

// }
class Execution {
    static int x;
    static int y;

    // メソッドで合計値を求める
    static int Sum() {
        int sum = 0;
        for (int i = x; i <= y; i++) {
            sum += i;
        }
        return sum;
    }
}


public class en_11_2 {
    public static void main(String[] args) {
        // x と y に値を代入
        Execution.x = 100;
        Execution.y = 200;

        // 合計値を求めるメソッドを呼び出し
        int result = Execution.Sum();

        // 結果を表示
        System.out.println("合計値: " + result);
    }
}
