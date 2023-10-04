import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        // create a new scanner class
        Scanner s=new Scanner(System.in);
        //print a massage
        System.out.println("Input any number to find that number's table");
        //declare a variable
        int a= s.nextByte();
        System.out.println("\n");
        for (int i = 1; i <=10 ; i++) {
            for (int j = a; j ==a ;j++) {
                System.out.println(j + " X " + i + " = " + (i*j));
            }
        }
    }
}
