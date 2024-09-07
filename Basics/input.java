import java.util.*;

public class input {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();//if we use .next then it takes only one string as input.

        System.out.println("Name is: "+ name);

        System.out.println("Enter 1st number");
        Scanner sc1 = new Scanner(System.in);
        float a = sc1.nextFloat();

        // Scanner sc3 = new Scanner(System.in);
        // String name1 = sc3.nextLine();

        System.out.println("Enter 2nd number ");
        float b = sc1.nextFloat();

        System.out.println("Addition is: "+ (a+b));

        System.out.println("Datatype is: " + name.getClass().getSimpleName());
        System.out.println("Datatype is: " + ((Object)a).getClass());
        
        System.out.println("Datatype is: " + ((Object)b).getClass().getSimpleName());
        //to get the datatype in java use the function getClass().getSimpleName()

    }
    
}
//nextLine()
//nextFloat()
//nextDouble()
//nextLine()
