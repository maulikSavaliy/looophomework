import java.util.Scanner;

public class SumOfPrimeNumber {
    public static void main(String[] args) {
        // declare a variable
        int sum = 0;
        // create a class
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        System.out.println("Sum of " + A + " natural number : ");
        for (int i = 1; i <= A; i++) {
          sum=sum+i;
        }
        System.out.println("Total : " + sum);
    }
}