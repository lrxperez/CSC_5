package functions;

import java.util.Scanner;

public class Functions {
    
    public static double m(int x)
    {
        double t=1.0;
        for(int i=1; i<=x; i*=2)
            t=t*i;
        return t;
    }

    public static void main(String[] args) {
        
        int value;
        
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter an integer value: ");
        value = kb.nextInt();
        
        System.out.printf("m(%d) = %f\n", value, m(value));        
    }
    
}
