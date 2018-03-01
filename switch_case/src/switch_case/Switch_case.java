package switch_case;
import java.util.Scanner;
public class Switch_case {

    public static void main(String[] args) {
                
        int value;
        
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter an integer value: ");
        value = kb.nextInt();
        
        switch(value)
        {
            case 0:
            case 2:
            case 4:
                System.out.println("line 16 executed...");
                break;
                
            case 1:
            case 3:
                System.out.println("line 19 executed...");
                break;
                        
            default:
                System.out.println("line 22 executed...");
        }
                
    }
    
}
