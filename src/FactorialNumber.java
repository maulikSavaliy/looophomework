import java.util.Scanner;

public class FactorialNumber {
    public static void main(String[] args) {
        //declare a variable
        int value =1;
        //create a scanner class
        Scanner s =new Scanner(System.in);
        //print a massage
        System.out.println("find factorial numbr :");
        int a=s.nextInt();
        // using a for syntex
        for (int i = 1; i <=a; i++) {
          value=value*i;
        }
        System.out.println(value);
    }
}
