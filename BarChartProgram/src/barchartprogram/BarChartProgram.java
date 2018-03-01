package barchartprogram;
import java.util.Scanner;

public class BarChartProgram {

    
    public static void main(String[] args) {
        
        // DOCUMENT TIME: 5m, 10m, 15m
        // TOTAL TIME: 30 minutes
        
        // declare array named nums to hold keyboard values
        int[] nums = new int[6];
        
        // create scanner
        Scanner kb = new Scanner(System.in);
        
        // ask user to enter 6 integer values
        System.out.print("Enter 6 integers ranging from 0 to 25: ");
        
        // populate array with keyboard values
        for(int i=0; i<=5 ;i++)
            nums[i] = kb.nextInt();
        
        // output title just for fun
        System.out.println("\nVALUE HISTOGRAM\n");
        
        // output keyboard values as histograph
        // for loop while i is less than # of array elements
        for(int i=0; i<=5 ;i++)
        {
            // output element value
            System.out.printf("%s: ", nums[i]);
            // for loop while j is less than element VALUE
                for(int j=1; j<=nums[i]; j++)
                    //output an asterisk
                    System.out.print("*");
            // and enter new line for next element value
            System.out.println();
        }
        
    }
    
}
