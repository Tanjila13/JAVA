
package day7;


public class MathclassDemo {
    public static void main(String[] args){
    
        int x = -3;
        int y = 2;
        
        int max = Math.max(x, y);
        System.out.println("Max= "+max);
        
        System.out.println(Math.min(x, y));
        
        int absolute = Math.abs(x);
        System.out.println("Absolute of x = "+absolute);
    
        double power = Math.pow(x, y);
        System.out.println("x to the power y = "+power);
        
       int round = Math.round(6.6f);
       System.out.println("Round = "+round);
    }
    
}
