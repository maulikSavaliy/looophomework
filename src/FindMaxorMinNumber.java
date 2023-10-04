import java.util.Scanner;

public class FindMaxorMinNumber {

    Scanner y=new Scanner(System.in);

    public int a= y.nextByte();
    public int b=y.nextInt();
    public int c= y.nextByte();
    static FindMaxorMinNumber x=new FindMaxorMinNumber();
    public static   void main(String[] args) {

        x.maximum();
        x.minimum();
    }
      void maximum(){
        if (a > b && a > c)
            System.out.println(a + " is maximum");
        if (b > a && b > c)
            System.out.println(b + " is maximum");
        if (c > a && c > b)
            System.out.println(c + " is maximum");

    }
     void minimum(){
        if (a < b && a < c)
            System.out.println(a + " is minimum");
        if (b < a && b < c)
            System.out.println(b + " is minimum");
        if (c < a && c < b)
            System.out.println(c + " is minimum");

    }

    }



