import java.util.Scanner;
public class pattern3{
    public static void main(String[] args) {
        System.out.print("Enter value of n: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int spaces = 2*n-2;

        for(int i = 1;i<=n;i++)
        {
            
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            for(int j=0;j<spaces;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }

            spaces -= 2;

            System.out.println("");
        }

        int space = 0;

        for(int i = 1;i<n;i++)
        {
            space += 2;
            
            for(int j=1;j<=n-i;j++)
            {
                System.out.print("*");
            }
            for(int j=1;j<=space;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=n-i;j++)
            {
                System.out.print("*");
            }


            System.out.println("");
        }

    }
}