package Interface_demo.session2interface;

public class main {

    public static void main(String[] args) {

        square sq = new square();
        sq.side = 10; // initialize
        sq.area();  // calculate
        sq.display(); // print



        circle c = new circle();
        c.radius=10;
        c.area();
        c.display();
        c.testdefault();

    }


}
