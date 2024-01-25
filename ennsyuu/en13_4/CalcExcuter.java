package en13_4;

public class CalcExcuter implements CalcAddSub, CalcMultiDiv {
    public int add(int x, int y) {
        return x + y;
    }

    public int sub(int x, int y) {
        return x - y;
    }

    public int mult(int x, int y) {
        return x * y;
    }

    public int div(int x, int y) {
        if (y != 0) {
            return x / y;
        } else {
            // Handle the case where y is 0 appropriately
            System.out.println("Cannot divide by zero.");
            return 0; // You can change this to throw an exception if needed
        }
    }
}


    // public int div(int x,int y);{
    //     return x/y;
    // }