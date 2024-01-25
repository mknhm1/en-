package en13_3;



// メインクラス
public class en_13_3 {
// メインメゾット
    public static void main(String[] args) {
        // Teacherクラスのインスタンスを生成
        Teacher teacher = new Teacher("竹井一馬", "教員", "情報処理");

        // Cookクラスのインスタンスを生成
        Cook cook = new Cook("大原太郎", "シェフ", "オムライス");
// 各クラスのメゾットを実行
        teacher.introduce();
        cook.introduce();
    }
}