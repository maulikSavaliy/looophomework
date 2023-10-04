import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        //declare a variable
        int count=0;
//create a new class
        Scanner s = new Scanner(System.in);
        // print a massage
        System.out.println("Input number to know it is Prime number or not :");
        int a = s.nextInt();
        //using a for loop
        for (int i = 1; i <=a; i++) {
            //use a if condition
            if (a%i==0){
             count++;
            }
        }if (count==2){
            System.out.println("prime number");
        }else {
            System.out.println("is not prime number");
        }


    }
}
