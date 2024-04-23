package Multithreading;

public class Test extends Thread {

    public void run(){
        System.out.println("Inside test thread");
    }

    public static void main(String[] args) {

        Test t = new Test();
        t.start();
        System.out.println("Inside main thread");

    }

}
