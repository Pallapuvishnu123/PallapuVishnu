import java.util.Scanner;

public class Sum {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("enter number : and range: ");
        int num = s.nextInt();
        int n = s.nextInt();
        int sum = 0;
        for (int i=1;i<=n;i++)
        {
            sum=sum+i;
        }

        System.out.println("Sum of First 100 Numbers is = " + sum);
    }
}
