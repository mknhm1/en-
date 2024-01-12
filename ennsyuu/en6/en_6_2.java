package en6;

public class en_6_2 {
    public static void main(String[] args){
        int n=100;
        int sum =0;
        int i =1;
        while(i <= n){
            sum += i;
            ++i;
        }
        System.out.println("合計は" + sum);
    }
}
