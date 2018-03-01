package while_loop;
import java.util.Scanner;
public class While_loop {

    public static void main(String[] args) {
                
        int value;
        
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter an integer value: ");
        value = kb.nextInt();
        
        while (value > 0 )
        {
            System.out.printf("Value = %d\n", value);
            value--;
        }
                
    }
    
}
