
package day12;


public class ArrayDemo {
    public static void main(String[] args){
        int[] array = new int[5];
        
        array[0] = 10;
        array[1] = 30;
        array[2] = 50;
        array[3] = 20;
        array[4] = 40;
        
        int sum= array[0]+array[1]+array[2]+array[3]+array[4];
        
        System.out.println("Result= "+sum);// for index sum result
        
        int len = array.length;
        System.out.println("Array size: "+len);//for array size or length
         
        System.out.println(array[0]);//for 0 number index print
        
        
        
    }
    
    
    
    
}
