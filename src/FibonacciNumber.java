import java.util.Scanner;

public class FibonacciNumber {
    public static void main(String[] args) {
        //declare a variable
        int x=0;
        int y=1;
        //create a new class
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        //print a massage
        System.out.println(" To find Fibonacci number up to " + a);
// using a forloop
        for (int i = 0; i<=a ; ++i) {
            System.out.print(x + ","+ ".");
            int z = x + y;
            x = y;//x=1,1,2,3,5=ans
            y = z;//y=1,2,3,5,8
        }
    }
}
