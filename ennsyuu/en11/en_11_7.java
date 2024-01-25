package en11;

import java.text.DecimalFormat;

class Student {
    private String name;
    private int studentNumber;
    private int[] testResults;

    // コンストラクタ
    public Student(String name, int studentNumber, int[] testResults) {
        this.name = name;
        this.studentNumber = studentNumber;
        this.testResults = testResults;
    }

    // 平均点を算出するメソッド
    public double calculateAverage() {
        int sum = 0;
        for (int result : testResults) {
            sum += result;
        }
        return (double) sum / testResults.length;
    }

    // // 合計点を算出するメソッド
    // public int calculateTotal() {
    //     int total = 0;
    //     for (int result : testResults) {
    //         total += result;
    //     }
    //     return total;
    // }

    // 学生情報を表示するメソッド
    public void displayStudentInfo() {
        DecimalFormat df = new DecimalFormat("#.###");
        System.out.println("学生番号: " + studentNumber);
        System.out.println("名前: " + name);
        System.out.println("平均点: " + df.format(calculateAverage()));
        System.out.println("------------------------------");
    }
}

public class en_11_7 {
    public static void main(String[] args) {
        // 3人分の学生情報を作成
        Student student1 = new Student("Aさん", 001, new int[]{89, 65, 88});
        Student student2 = new Student("Bさん", 002, new int[]{80, 95, 64});
        Student student3 = new Student("Cさん", 003, new int[]{70, 80, 98});

        // 学生情報を表示
        student1.displayStudentInfo();
        student2.displayStudentInfo();
        student3.displayStudentInfo();
    }
}
