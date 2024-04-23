package Interface_demo.session2interface;

public class circle extends Shape implements Area{

    int radius;
    @Override
    public void area() {
        this.area = (float) (3.14*radius * radius);
    }

    @Override
    public void display() {
        System.out.println("The area of circle is :"+area);
    }
}



/* create method called shape
create Area interface
The shape extends into a square and implement area into square

 */