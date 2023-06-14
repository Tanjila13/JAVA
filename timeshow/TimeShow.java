
package timeshow;


public class TimeShow {
    private int Second;
    private int Minute;
    private int Hour;
    TimeShow(){
    System.out.println("Nothing to show \n");
            }
    TimeShow(int x,int y,int z){
    System.out.println("eceived three parameters s: "+x+" m: "+y+" h: "+z+"\n");
    }
    TimeShow(TimeShow Obj2){
    System.out.println(Obj2);
    }
    void display(int x){
    if(x==1)
    System.out.println("call name of Obj--1");
    else if(x==2)
        System.out.println("call of Obj--02");
     else
        System.out.println("call of Obj--03");
    }
}
