package Interface_demo.session2interface;

public class square extends Shape implements Area{

    int side;
    @Override
    public void area() {
        this.area = side * side;
    }

    @Override
    public void display() {
       // super.display();
        Area.displayArea();
        System.out.println("The area of square is :"+area);
    }
}
