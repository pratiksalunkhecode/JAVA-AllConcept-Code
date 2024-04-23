package lambda_Expression;

public class Testm1 {

    int y = 20;  // instance variable of the class
    public void m2(){
       // AtomicInteger x = new AtomicInteger(10);
        int x = 10;  // local variable of the method
      m1 m = () -> {
          // x.set(200);
           y =200;
         //  x = 100; // local Variable used in lambda expression should be final or effectively final we cant change
          System.out.println(x);
          System.out.println(y);
        };
      m.m1();


    }
}
