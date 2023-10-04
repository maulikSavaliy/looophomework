import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        //use a scanner class
        Scanner s=new Scanner(System.in);
        //print a massage
        System.out.println("Enter a number to find a reverse number untill xero ");
        //declare a variable
        int a=s.nextInt();
        //use a forloop
        for (int i = a; i >=0 ; i--) {
            System.out.println(i);
        }

    }
}
