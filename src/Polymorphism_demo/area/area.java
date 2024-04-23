package Polymorphism_demo.area;

public class area {
  // Overloading example
    public void area(int side){
        System.out.println("area of the circle is"+ side * side);
    }

    public void area(int len, int wed){
        System.out.println("area of the circle is"+ len * wed);
    }

    public void area(float radius){
        System.out.println("area of the circle is"+ 3.14*radius*radius);
    }
}
