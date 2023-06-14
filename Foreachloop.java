
package day13;


public class Foreachloop {
    public static void main(String[] args){
    
    String[] names = {"munni","mahi","asa","tohu"};
    int[] numbers={5,10,20,30};
   
    /*names[0]="munni";
    names[1]="mahi";
    names[2]="asa";
    names[3]="tohu";*/
    
    /*for(int i=0;i<4;i++){
    System.out.println(names[i]);
    }*/
    
    for(String x :names){
    System.out.println(x);//print names 
    }
    int sum = 0;
    for(int y: numbers){
        sum = sum+y;
    System.out.println(y);//print numbers
   }
    System.out.println(sum);//print sum result
    }
    
}
