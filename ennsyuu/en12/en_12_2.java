package en12;

//personクラス
class Person {
    //プロパティ
    String name;
    String job;

//

Person(String name, String job) {
        this.name = name;
        this.job = job;
    }
//
    void introduce() {
        System.out.println("名前: " + name);
        System.out.println("職業: " + job);
    }
}
//
class Teacher extends Person {
    String subject;
//
    Teacher(String name, String job, String subject) {
        super(name, job);
        this.subject = subject;
    }
//
    void introduce() {
        super.introduce();
        System.out.println("教科: " + subject);

    }
}


//
class Cook extends Person {
    String specialitiles;

    Cook(String name, String job, String specialitiles) {
        super(name, job);
        this.specialitiles = specialitiles;
    }
//
    void introduce() {
        super.introduce();
        System.out.println("得意料理: " + specialitiles);
    }
}

//
public class en_12_2 {
//
    public static void main(String[] args) {
        Teacher teacher = new Teacher("近藤勇", "教員", "Go言語");
        Cook cook  = new Cook("沖田総司", "シェフ", "オムライス");
        teacher.introduce();
        cook.introduce();
    }
}




//     //personクラス
// class Person{
//     //プロパティ
//     char name;
//     char job;

//     //メゾット
//     void introduce(char name, char job){
//         System.out.println("氏名"+name);
//         System.out.println("職業"+job);
//     }
// }


// class Teacher extends Person{
//     char subject;

//     void introduce();{super.introduce();System.out.println("教科"+subject);
//     }

// }

// class Cook extends Person{

// }
// public class en_12_2 {
    
// }

