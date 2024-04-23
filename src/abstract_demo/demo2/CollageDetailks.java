package abstract_demo.demo2;

public class CollageDetailks extends Collage{

    CollageDetailks(int roll, String name){
        super(roll, name);
    }
    @Override
    public void name() {
        System.out.println("my name is "+name);
    }

    @Override
    public void city() {
        System.out.println("my city is "+city);
    }

    @Override
    public void lastYearMark() {
        System.out.println("my last year Mark is "+lastYearMark);
    }
}
