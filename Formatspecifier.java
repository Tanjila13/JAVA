
package pkg611basicday1;


public class Formatspecifier {
    public static void main(String[] args){
        
        boolean b = true;
        char c = 'x';
        int i = 10;
        float f = 10.3f;
        double d = 2.0;
        short s = 678;
        
        System.out.printf("result= %s \n",s);//format specifier and ecsape sequence use
        System.out.printf("result= %b \n",b);
        System.out.printf("result= %c \n",c);
        System.out.printf("result= %d \n",i);
        System.out.printf("result= %f \n",f);
        System.out.printf("result= %.2f \n",f);
        System.out.printf("result= %f \n",d);
        System.out.printf("result= %.3f \n",d);
        
    
    }
    
}
