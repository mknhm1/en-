package en13.en13_3;

// Cookクラス
class Cook implements Person {

// プロパティ
    private String specialties;
    private String name;
    private String job;

// コンストラクタ
    Cook(String name, String job, String specialties) {
        this.name=name;
        this.job=job;
        this.specialties = specialties;
    }

// メゾット(名前、仕事、得意料理の表示)
    public void introduce() {
        System.out.println("氏名: " + name);
        System.out.println("職種: " + job);
        System.out.println("得意料理: " + specialties);
    }
}


// class Cook implements Person {
//     private String specialties;
//     private String name;
//     private String job;

//     Cook(String name, String job, String specialties) {
//         this.name = name;
//         this.job = job;
//         this.specialties = specialties;
//     }

//     // Getters for encapsulation
//     public String getName() {
//         return name;
//     }

//     public String getJob() {
//         return job;
//     }

//     public String getSpecialties() {
//         return specialties;
//     }

//     public void introduce() {
//         System.out.println("氏名: " + name);
//         System.out.println("職種: " + job);
//         System.out.println("得意料理: " + specialties);
//     }
// }
