package Patterns_2;

import java.util.*;

public class butterfly {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        for(int i=1; i<=a; i++)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print("*");
            }
            int space = 2*(a-i);
            for(int j=1; j<=space; j++)
            {
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        

        for(int i=a; i>=1; i--)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print("*");
            }
            int space = 2*(a-i);
            for(int j=1; j<=space; j++)
            {
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
