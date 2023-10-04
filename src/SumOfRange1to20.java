import java.util.Scanner;

public class SumOfRange1to20 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int sum=0;
        System.out.println("Enter a number to sum Range between 1 to 20 :");
        System.out.println("enter a first number :");
        int a=s.nextInt();
        System.out.println("Enter a second number :");
        int b=s.nextInt();
        for (int i = a; i <=b ; i++) {
            sum=sum+i;
        }
        System.out.println(" total : " + sum);
    }
}
