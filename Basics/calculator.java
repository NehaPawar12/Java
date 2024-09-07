import java.util.*;

public class calculator {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        float num1 = sc.nextFloat();
        System.out.println();
        System.out.print("Enter 2nd number: ");
        float num2 = sc.nextFloat();

        Scanner sc1 = new Scanner(System.in);
        System.out.println();
        System.out.print("Enter the operator: ");
        String op = sc1.next();

        switch(op){
            case "+":
                System.out.println("Addition is: "+ (num1 + num2));
                break;
            case "-":
                System.out.println("Subtraction is: "+ (num1 - num2));
                break;
            case "*":
                System.out.println("Multiplication is: "+ (num1 * num2));
                break;
            case "/":
                System.out.println("Division is: "+ (num1 / num2));
                break;
            case "%":
                System.out.println("Modulo is: "+ (num1 % num2));
                break;
            default:
                System.out.println("Invalid operator");
            
        }
        System.out.println(((Object)num1).getClass().getSimpleName());

    }
    
}
