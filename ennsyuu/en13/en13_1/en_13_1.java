package en13.en13_1;

// Personクラス
abstract class Person {
    String name;
    String job;

    // コンストラクタ
    public Person(String name, String job) {
        this.name = name;
        this.job = job;
    }

    public String getname(){
        return this.name;
    }

    public String getjob(){
        return this.job;
    }
    abstract void introduce();
}

// Teacherクラス
class Teacher extends Person {
    String subject;

    Teacher(String name, String job, String subject) {
        super(name, job);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    void introduce() {
        System.out.println("氏名: " + name);
        System.out.println("職種: " + job);
        System.out.println("担当科目: " + subject);
    }
}

// Cookクラス
class Cook extends Person {
    String specialties;

    Cook(String name, String job, String specialties) {
        super(name, job);
        this.specialties = specialties;
    }

    void introduce() {
        System.out.println("氏名: " + name);
        System.out.println("職種: " + job);
        System.out.println("得意料理: " + specialties);
    }
}

public class en_13_1 {
    public static void main(String[] args) {
        // Teacherクラスのインスタンスを生成
        Teacher teacher = new Teacher("竹井一馬", "教員", "情報処理");

        // Cookクラスのインスタンスを生成
        Cook cook = new Cook("大原太郎", "シェフ", "オムライス");

        // 各インスタンスの情報を表示
        // System.out.println("教員の情報:");
        teacher.introduce();
        // System.out.println("\nシェフの情報:");
        cook.introduce();
    }
}






// //personクラス
// abstract class Person {
//     //プロパティ
//     String name;
//     String job;

// //


// //
//     private Person(String name, String job) {
//         this.name = name;
//         this.job = job;
// }
//     abstract void introduce() ;
//         System.out.println("名前: " + name);
//         System.out.println("職業: " + job);
//     }
// //
// class Teacher extends Person {
//     String subject;
// //
//     Teacher(String name, String job, String subject) {
//         super(name, job);
//         this.subject = subject;
//     }
// //
//     void introduce() {
//         super.introduce();
//         System.out.println("教科: " + subject);
//     }
// }


// //
// class Cook extends Person {
//     String specialitiles;

//     Cook(String name, String job, String specialitiles) {
//         super(name, job);
//         this.specialitiles = specialitiles;
//     }
// //
//     void introduce() {
//         super.introduce();
//         System.out.println("得意料理: " + specialitiles);
//     }
// }

// //
// public class en_13_1 {
// //
//     public static void main(String[] args) {
//         Teacher teacher = new Teacher("近藤勇", "教員", "Go言語");
//         Cook cook  = new Cook("沖田総司", "シェフ", "オムライス");
//         teacher.introduce();
//         cook.introduce();
//     }
// }

