package Interface_demo;

public class Car implements Engine, mediaPlayer, Break {


    @Override
    public void start() {
        System.out.println("start the car");
    }

    @Override
    public void stop() {
        System.out.println("stop the car");
    }

    @Override
    public void accelerate() {
        System.out.println("acc the car");
    }

    @Override
    public void Break() {
        System.out.println("break");
    }
}

