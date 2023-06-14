
package callbyvaluedemo;


public class CallbyvalueDemo {
    public class Student 
{ 
 
 } 
public class Library 
{ 
 
 } 
public class Admin 
{ 

 } 
public class Employee 
{ 

 } 
public class College 
{ 

     { 
       
         System.out.println("m1 is calling."); 
      } 

    public static void m2(Admin a, Employee ep)
    { 
      System.out.println("m2 is calling"); 
    }

    
    public static void main(String[] args) {
       
 



    College c = new College(); 
 
     Student s = new Student();  
     Library l = new Library(); 

// Pass object reference variables "s" and "l" as argument value to the method m1 for calling m1(). 
      c.m1(s, l); // (3) 

// Above three lines of code 1, 2, and 3 can be replaced by a single line of code. Both are the same as working. 
      c.m1(new Student(), new Library()); 
      Admin a = new Admin(); 
      Employee ep1 = new Employee(); 
      College.m2(a, ep1); // We can pass different Employee type reference variable. Reference Variable name is not important but Employee type is important. So, don't confuse in ep and ep1. 
 
  // OR 
      College.m2(new Admin(), new Employee()); 
   } 
}
        
       
    
    


