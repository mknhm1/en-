// package en6;

// public class en_6_7 {
//     public static void main(String[] args){
//         for (int i=1; i<9; i++)
//             System.out.println(+i+"の段");
//             for (int u=1; u<9; u++)
//             t =i+u
//                 System.out.println(+i+"*"+u+"="+t+);
//     }
// }


package en6;

public class en_6_7 {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            System.out.println(i + "の段");
            for (int u = 1; u <= 9; u++) {
                int t = i * u;
                System.out.println(i + "*" + u + "=" + t);
            }
        }
    }
}
