// package en8;

// public class en_8_1 {
//     int [] a=new int[10];
//     for (int i=0; i<a. length; i++)
//     a[i]=i+1;
//     for (int i=0; i<a. length, i++)
//         System.out.println("a["+i+"]="+a[i]);
// }


package en8;

public class en_8_1 {
    public static void main(String[] args) {
        int[] a = new int[10];

        // Initialize the array elements
        for (int i = 0; i < a.length; i++) {
            a[i] = i + 1;
        }

        // Print the array elements
        for (int i = 0; i < a.length; i++) {
            System.out.println("a[" + i + "] = " + a[i]);
        }
    }
}
