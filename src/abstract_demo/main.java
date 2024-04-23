package abstract_demo;

public class main {

    public static void main(String[] args) {

        son s = new son(25);
        s.carrier();
        s.normalMethod();
        s.city();

        daughter d = new daughter(22);

        d.city();
        d.carrier();

     parent.name();
     //   parent p = new parent(); you can not create object like this of a abstract class
//        parent p = new parent(30) {                                  need to override the methods
//            @Override
//            void city() {
//
//            }
//
//            @Override
//            void carrier() {
//
//            }
//        };




    }




}
