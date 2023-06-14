
package inheritance1demo;

class A {

    int i = 5;

    void show1() {
        System.out.println("i form A = " + i);

    }

}

class B extends A {

    int i = 10;

    void show2() {
      
        System.out.println("i form B = " + i);

    }

}

class C extends B {

    int i = 15;

    void show3() {
        System.out.println("i form C = " + i);

    }

}

public class Inheritance2Demo {
    
    public static void main(String[] args){
       A obj1 =  new A();
        obj1.show1();
       B obj2= new B();
        obj2.show2();
       C obj3 = new C();
        obj3.show3();
    
    
    }
    
}
