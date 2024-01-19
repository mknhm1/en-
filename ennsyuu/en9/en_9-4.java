package en9;
import java.util.Scanner;

public class en_9_4{
    static void print(int n) {
        for (int i = 0; i < n; i++) {
        }
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        // System.out.print("Enter an integer: ");
        int n = stdIn.nextInt();
        // Call the print method with user input
        print(n);
        stdIn.close(); // Close the Scanner when done
    }
}


