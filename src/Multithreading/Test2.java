package Multithreading;
import java.io.*;
import java.util.*;
class Test2 extends Thread {

    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("inside test thread");
        }
    }

}

/*
Two threads running independently and execute their statement 
 */

