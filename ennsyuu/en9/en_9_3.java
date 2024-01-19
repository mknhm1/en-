// package en9;

// static void print(String a, int n){
//     for (int i= 0; i < n; i++)
//         System.out.println(a);
// }
// import java.util.Scanner;
// public class en_9_3 {
//     public static void main(String[] args){
//         Scanner stdIn=new Scanner(System.in);
//         String a = stdIn.next();
//         int n =stdIn.nextInt();


//     }
// }

package en9;

import java.util.Scanner;

public class en_9_3 {

    static void print(String a, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(a);
        }
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        
        // System.out.print("Enter a string: ");
        String a = stdIn.next();
        
        // System.out.print("Enter an integer: ");
        int n = stdIn.nextInt();
        
        // Call the print method with user input
        print(a, n);
        
        stdIn.close(); // Close the Scanner when done
    }
}
