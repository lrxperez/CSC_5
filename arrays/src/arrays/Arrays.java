package arrays;

import java.util.Scanner;

public class Arrays {
    
    public static void main(String[] args) {
        
        int value;
        
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter an integer value: ");
        value = kb.nextInt();
        
        double f[] = new double[value+1];
        
        for (int i=0; i<=value; i++)
        {
            if(i==0 || i==1) 
                f[i]=1.0;
            else 
                f[i]=f[i-1]*i;
        }
        
        // he had some for loop here?? idk
    }
    
}
