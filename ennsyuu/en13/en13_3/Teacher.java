package en13.en13_3;

// Teacherクラス
class Teacher implements Person{
    // プロパティ(プライべート)
    private String subject;
    private String name;
    private String job;

// コンストラクタ
    Teacher(String name, String job, String subject) {
        this.name=name;
        this.job=job;
        this.subject = subject;
    }


//メゾット(名前、仕事、科目の表示)
    public void introduce() {
        System.out.println("氏名: " + name);
        System.out.println("職種: " + job);
        System.out.println("担当科目: " + subject);
    }
}