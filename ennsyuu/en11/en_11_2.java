package en11;

// class settlement_execution{

// }
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
