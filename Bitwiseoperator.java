
package pkg611basicday1;


public class Bitwiseoperator {
    public static void main(String[] args) {
        
        int z; 
        int x =32;
        int y = 12;
        
        z = x&y;
        System.out.println("bitwise And: "+z);
        
        z = x|y;
        System.out.println("bitwise OR: "+z);
        
        z = x^y;
        System.out.println("bitwise ExOR: "+z);
        
        z=  x>>3;
        System.out.println("bitwise Right Shift: "+z);
        
         z = y<<2;
        System.out.println("bitwise Left Shift: "+z);
        
        
        
        
        
        
        
    }
    
}
