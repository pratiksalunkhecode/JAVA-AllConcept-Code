package abstract_demo.demo2;

abstract public class Collage {

    abstract public void name();
    abstract public void city();
    abstract public void lastYearMark();

    int roll;
    String name;
    String city;
    String lastYearMark;

    public Collage(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }

    Collage(){
        this.roll=1;
        this.name="pratik";
        this.city="mumbai";
        this.lastYearMark="100";
    }


    public static void greeting(){
        System.out.println("hey im from Collage class");
    }

}
