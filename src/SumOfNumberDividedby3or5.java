import java.util.Scanner;

public class SumOfNumberDividedby3or5 {
    public static void main(String[] args) {
//use a for loop
        for (int i = 1; i <=100 ; i++) {
            if ((i%3==0) && (i%5==0)){
                System.out.print(i +",");
            }
            
        }
    }
}
