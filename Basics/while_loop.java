import java.util.*;

public class while_loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int ans = 0;
        int sum = 0;
        // while(num != 0)
        // {
        //     int dig = num%10;
        //     ans = (ans*10) + dig;
        //     num /= 10;
        // }
        // System.out.println(ans);

        while (num != 0) {
            int dg = num%10;
            sum += dg;
             num /= 10;
        }
        System.out.println(sum);
    }
}
//reverse the integer and digit sum
