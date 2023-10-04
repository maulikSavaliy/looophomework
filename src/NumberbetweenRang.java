import java.util.Scanner;

public class NumberbetweenRang {
    public static void main(String[] args) {
        // create a scaner class
        Scanner s=new Scanner(System.in);
        // print massage
        System.out.println("To know number between you enter range :");
        System.out.println("Enter a First number :");
        // declare variable
        int a=s.nextInt();
        System.out.println("Enter a Second number :");
        //declare variable 2
        int b=s.nextInt();
        // using a forloop
        for (int i = a; i <=b ; i++) {
            System.out.println(i);
        }
    }
}
