import java.util.Scanner;

public class FindAvarageandSumBetweenRange {
    public static void main(String[] args) {
        // create a scanner class
        Scanner s=new Scanner(System.in);
        // declate a variable
        double total=0;
        int x=0;
        // print a massage
        System.out.println("Enter a first number :");
        double a= s.nextInt();
        //print a massage
        System.out.println("Enter a second number :");
        double b= s.nextInt();
        //using a for loop
        for (double i = a; i <=b; i++) {
            //a<=b is true store in i and total value is zero than sum of i+total
            total=total+i;
            //a<=b condition pass how many time pass its increse x value
            x++;
        }
        System.out.println(total);
        System.out.println(total/x);
    }
}
