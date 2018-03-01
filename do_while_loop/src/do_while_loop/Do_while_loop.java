package do_while_loop;
import java.util.Scanner;
public class Do_while_loop {

    public static void main(String[] args) {
                
        int value;
        
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter an integer value: ");
        value = kb.nextInt();
        
        do 
        {
            System.out.printf("Value = %d\n", value);
            value--;
        } while ( value > 0 );      
    }
    
}
