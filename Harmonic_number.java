
package harmonic_number;


public class Harmonic_number {

    public static void main(String[] args) {
       int n = Integer.parseInt(args[0]); 
           int sum=0;
        // compute 1/1 + 1/2 + 1/3 + ... + 1/n         double sum = 0.0; 
        for (int i = 1; i <= n; i++) {            
          sum += 1.0 / i; 
        } 
 
        // print the nth harmonic number 
        System.out.println(+sum); 
    } 

    }
    

