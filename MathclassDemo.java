
package pkg611basicday1;


public class MathclassDemo {
    public static void main(String[] args) {
        
       int x =5;
       int y = 10;
       int z = 2;
       int max,min,absulate,round;
       double power,pi ;
               
       max = Math.max(x,y);
       System.out.println("Max= "+max);
       
       min = Math.min(x,y);
       System.out.println("Min= "+min);
       
       //System.out.println(Math.max(x, y)); find max another way 
       //System.out.println(Math.min(x, y)); find min another way 
      //  System.out.println(Math.abs(y)); find absulate another way 
      //System.out.println(Math.round(5.4));find round another way 
       //System.out.println(Math.PI);find pi another way 
       
       
       absulate = Math.abs(y);
       System.out.println("Absulate of y= "+absulate);
       
       power = Math.pow(y,z);
       System.out.println("y power of x= "+power);
       
       round = Math.round(5.5f); //convert into integer
       System.out.println("Round = "+round);
       
       pi = Math.PI; //convert into integer
       System.out.println("values of pi = "+pi);
       
       System.out.println(Math.E);
       
       
       
       
       
       
       
       
       
       
       
    }
    
}
