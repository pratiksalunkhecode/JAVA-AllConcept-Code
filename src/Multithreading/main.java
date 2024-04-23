package Multithreading;
import java.io.*;
import java.util.*;
public class main {
    public static void main(String[] args) throws InterruptedException {

        Test2 t1 = new Test2();
        t1.start();

        for (int i = 0; i < 5; i++) {
            System.out.println("inside main thread");
            Thread.sleep(100000);
        }

    }
}
