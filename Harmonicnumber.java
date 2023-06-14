
package harmonicnumber;

import static java.lang.Double.sum;


public class Harmonicnumber {

   
    public static void main(String[] args) {
        
        
        int n = Integer.parseInt(args[0]); 
 
        // compute 1/1 + 1/2 + 1/3 + ... + 1/n         double sum = 0.0; 
        for (int i = 1; i <= n; i++) {             
          sum += 1.0 / i; 
        } 
 
        // print the nth harmonic number 
        System.out.println(+sum); 
     
    }

    }
    

