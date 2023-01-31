import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {

        System.out.println("""
                Here we have to draw line by using cartesian method\s
                In cartesian method to draw line we need 2 reference points\s
                
                please Enter the co-ordinates of points\s
                 """);
       double length1 = line();
        System.out.println("\nEnter the Co-Ordinates for 2nd line\n");
        double length2 = line();
        System.out.println(Objects.equals(length1, length2));
        if(length1 == length2){
            System.out.println("Lengths of both the lines are Equal");
        } else if (length1 > length2) {
            System.out.println("Length of line 1 is greater than line 2");

        } else {
            System.out.println("Length of line 2 is greater than line 1");
        }

    }
    public static double line(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter X co-ordinate of point 1 : ");
        int x1 = sc.nextInt();
        System.out.println("Enter Y co-ordinate of point 1 : ");
        int y1 = sc.nextInt();
        System.out.println("Enter X co-ordinate of point 2 : ");
        int x2 = sc.nextInt();
        System.out.println("Enter Y co-ordinate of point 2 : ");
        int y2 = sc.nextInt();
        double length = Math.sqrt(Math.pow((x2-x1), 2) + Math.pow((y2-y1), 2) );
        System.out.println("length of line : " +length);
        return length;

    }

}