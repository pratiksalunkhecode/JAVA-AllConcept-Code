package Polymorphism_demo;

public class child extends Parent{

    // you cannot override static method
    static void fun(){
        System.out.println("this is my child");
    }

}
