import java.util.Scanner;
public class patterns{
    public static void main(String[] args) {
        System.out.print("Enter value of n: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 0;i<n;i++)
        {
            int stars;
            if(i<n/2)
            {
                stars = i + 1;
            }
            else
            {
                stars = n-i;
            }
            for(int j=0;j<stars;j++)
            {
                System.out.print("*");
            }

            System.out.println("");
        }

    }
}