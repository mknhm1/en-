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





// package en13.en13_1;

// // Personクラス
// abstract class Person {
//     private String name;
//     private String job;

//     // コンストラクタ
//     public Person(String name, String job) {
//         this.name = name;
//         this.job = job;
//     }

//     public String getname(){
//         return this.name;
//     }

//     public String getjob(){
//         return this.job;
//     }
//     abstract void introduce();
// }

// // Teacherクラス
// class Teacher extends Person {
//     String subject;

//     Teacher(String name, String job, String subject) {
//         super(name, job);
//         this.subject = subject;
//     }

//     public String getSubject() {
//         return subject;
//     }

//     void introduce() {
//         System.out.println("氏名: " + name);
//         System.out.println("職種: " + job);
//         System.out.println("担当科目: " + subject);
//     }
// }

// // Cookクラス
// class Cook extends Person {
//     String specialties;

//     Cook(String name, String job, String specialties) {
//         super(name, job);
//         this.specialties = specialties;
//     }

//     void introduce() {
//         System.out.println("氏名: " + name);
//         System.out.println("職種: " + job);
//         System.out.println("得意料理: " + specialties);
//     }
// }

// public class en_13_1 {
//     public static void main(String[] args) {
//         // Teacherクラスのインスタンスを生成
//         Teacher teacher = new Teacher("竹井一馬", "教員", "情報処理");

//         // Cookクラスのインスタンスを生成
//         Cook cook = new Cook("大原太郎", "シェフ", "オムライス");

//         // 各インスタンスの情報を表示
//         // System.out.println("教員の情報:");
//         teacher.introduce();
//         // System.out.println("\nシェフの情報:");
//         cook.introduce();
//     }
// }


