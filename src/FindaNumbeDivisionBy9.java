import java.util.Scanner;

public class FindaNumbeDivisionBy9 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        // declare a variable
        int total=0;
        //print a massage
        System.out.println("Find out sum of number in range and it's divided by 9 or not :");
        System.out.println("Enter a First number :");
        //declare a variable
        int a =s.nextInt();
        System.out.println("Enter a Second number :");
        int b =s.nextInt();
        //using a for loop
        for (int i = a; i <=b ; i++) {
            total=total+i;
        }
        System.out.println("Total of that range of number :" +  total);
        // use if statement to pass another condition
        if (total%9==0){
            System.out.println("it is divided by 9");
        }else {
            System.out.println("it is not divided ny 9");
        }
    }
}
