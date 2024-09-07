import java.util.*;

public class switch_ {
    
    public static void main(String arg[])
    {
        System.out.println("Enter any value between 1 to 3: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        switch (num) {
            case 1:
                System.out.println("Hello");
                break;
            case 2:
                System.out.println("Namaste");
                break;
            case 3:
                System.out.println("Namaskar");
                break;
        
            default:
                break;
        }
    }
}
