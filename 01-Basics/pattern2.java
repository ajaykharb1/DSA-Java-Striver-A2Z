import java.util.Scanner;
public class pattern2{
    public static void main(String[] args) {
        System.out.print("Enter value of n: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int spaces = 0;

        for(int i = 0;i<n;i++)
        {
            
            for(int j=0;j<n-i;j++)
            {
                System.out.print("*");
            }
            for(int j=0;j<spaces;j++)
            {
                System.out.print(" ");
            }
            for(int j=0;j<n-i;j++)
            {
                System.out.print("*");
            }

            spaces += 2;

            System.out.println("");
        }

        int space = 2*n-2;

        for(int i = 1;i<=n;i++)
        {
            
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            for(int j=0;j<space;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }

            space -= 2;

            System.out.println("");
        }

    }
}