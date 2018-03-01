package simple_if_else_example;
import java.util.Scanner;
public class Simple_if_else_example {

    public static void main(String[] args) {
                
        int value;
        
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter an integer value: ");
        value = kb.nextInt();
        
        if ( value == 0 )
            System.out.println("Value is to equal to zero");
        else if ( value < 0 )
            System.out.println("Value is less than zero");
        else 
            System.out.println("Value is greater than zero");
                
    }
    
}
