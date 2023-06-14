
package timeShowExample;

public class TimeShowExample{
    
public static void main(String[] args) {
    TimeShow ob1=new TimeShow();
     TimeShow ob2=new TimeShow(5,30,1);
        TimeShow ob3=new TimeShow(ob1);
        
       ob1.display(1);
       ob1.display(2);
       ob1.display(3);
       
    
}
}

}
