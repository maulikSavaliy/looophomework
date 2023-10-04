import java.util.Scanner;

public class CountTotalNumberOfChar {
    public static void main(String[] args) {
        // create scanner class
        Scanner s=new Scanner(System.in);
        //declare a variable
        int total=0;
        // print a massage
        System.out.println("Enter any line :");
        String name=s.next();
        System.out.println("Enter any char to find howmany time in that line:");
        char c=s.next().charAt(0);
        //for loop syntax "name.length declare a length of character"
        for ( int i = 0; i <name.length(); i++) {
            // if statement name,chaAt(i) it show a range of character
            if(name.charAt(i)==c)
                //if range of character is match with our input char it's store value in total
                total++;
        }
        System.out.println("Total number of char  " + c +" :" + total);

        }

         }




