package Java_Live_OOP;

public class Polymorphism_In_Java {

    public static int add(int a){
        return a;
    }

    public static int add(int a, int b){
        return a+b;
    }

    public static boolean add(double a, double b){
      System.out.println("this is a double value"+a+b);
        return false;
    }


    public static void main(String[] args) {

        Polymorphism_In_Java n = new Polymorphism_In_Java();

        System.out.println(n.add(10));
        System.out.println(n.add(10,20));
        System.out.println(n.add(23.2,23.9));

    }
}
