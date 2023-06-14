
package day7;


public class BreakcontinueDemo {
    public static void main(String[] args){
    
        for (int i = 0; i < 100; i++) {
            
            if(i==10)
            
             break;
            System.out.println(i);
        }
    
    
        for (int i = 0; i <=10; i=i+2) {
            if(i==10)
            break;
             System.out.print(" ");
            System.out.println(i);
            
        }
        
        for (int i = 0; i <=15; i++) {
            if(i==10)
                continue;
            System.out.print("\n ");
            System.out.println(i);
                
            }
        
        for (int i = 1; i <=15; i=i+2) {
            if(i==10)
                continue;
            System.out.print("\n  ");
            System.out.println(i);
                
            }
    
    }
    
    
    
}
