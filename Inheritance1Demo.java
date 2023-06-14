package inheritance1demo;

class A {

    int i = 5;

    void show1() {
        System.out.println("i form A = " + i);

    }

}

class B extends A {
     int i = 5;
    void show2() {
    System.out.println("i from B = " + i);

    }
}

public class Inheritance1Demo {

    public static void main(String[] args) {
        A obj1 = new A();
        obj1.show1();
        B obj2 = new B();
        obj2.show2();

    }

}
