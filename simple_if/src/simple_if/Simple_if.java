package simple_if;
import java.util.Scanner;
public class Simple_if {

    public static void main(String[] args) {
                
        int value;
        
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter an integer value: ");
        value = kb.nextInt();
        
        if ( value>=0 )
            System.out.println("Value is greater than or equal to zero");
                
    }
    
}
