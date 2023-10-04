import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        // create a scanner class
        Scanner M =new Scanner(System.in);
// print a massage
        System.out.println("Enter a first number : ");
        // declare a variable
        double a=M.nextInt();
        System.out.println("Enter a second number : ");
        double b=M.nextInt();
        System.out.println("use ' + ',' - ',' * ',' / ' operate to calculate number ");
        String sign=M.next();
        //using a switch syntecx
        switch (sign){
            case "+":
                System.out.println(a+b);
                break;
            case "-":
                System.out.println(a-b);
                break;
            case "*":
                System.out.println(a*b);
                break;
            case "/":
                System.out.println(a/b);
                break;
        }
    }
}
