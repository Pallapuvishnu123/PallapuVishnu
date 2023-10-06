import java.util.Scanner;

public class LargeNumber {
        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            System.out.println("Enter three number : ");
            int a =s.nextInt();
            int b = s.nextInt();
            int c = s.nextInt();
                if (a >= b && a >= c)
                    System.out.println(a + " is the largest Number");
                else if (b >= a && b >= c)
                    System.out.println(b + " is the largest Number");
                else
                    System.out.println(c + " is the largest number");
            }
        }







