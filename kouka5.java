import java.util.ArrayList;
import java.util.Scanner;

public class kouka5 {
    public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);

    // 教科数をnumに代入
    int num = 5;
    // arrayList型の変数listを宣言し、空のarrayListを代入する

    ArrayList<Integer> list = new ArrayList<Integer>();

    // 各教科ごとの点数を入力してもらい、listに追加する
    for(int i = 0;i < num; i++){
        // 入力を促す文字列を表示する
        System.out.print((i+1)+"教科目の点数を入力して下さい：");
        // 入力してもらった点数をリストに格納する

        list. add (Integer.parseInt(stdIn.nextLine()));

        }

            // 点数の合計を管理する変数sumを宣言し、0で初期化する
            int sum = 0;
            //listに格納されている点数の平均を求める
            for(int i = 0;i < num; i++){
              // listの点数を取り出し、sumの中に足していく
            sum = sum + list.get (i);
}

            System.out.println("合計点、"+sum);
            //平均点数を管理する変数aveを宣言し、平均点数を計算し、代入する
            double ave = (double)sum / num;
            //平均点数を表示する
            System.out.println("平均点、"+ave);
    }
}
