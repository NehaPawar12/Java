package Patterns;
import java.util.*;

public class other_side_tri {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=n-i; j++)//space
            {
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++)//stars
            {
                System.out.print("*");
            }
            System.out.println();
    }
}
}
