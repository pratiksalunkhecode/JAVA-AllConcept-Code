public class main {

    public static void main(String[] args) {

//        Singleton t = Singleton.getInstance();
//        t.dbconnection();
//
//        Singleton t1 = Singleton.getInstance();
//        t1.dbconnection();

        Singleton.getInstance().dbconnect();
        Singleton.getInstance().dbconnect();
        Singleton.getInstance().dbconnect();
        Singleton.getInstance().dbconnect();


    }

}
