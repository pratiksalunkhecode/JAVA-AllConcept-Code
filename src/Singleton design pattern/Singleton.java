public class Singleton {

    private static Singleton instance;

    private Singleton(){
        System.out.println("private constructor");
    }

    public static Singleton  getInstance(){

        if(instance == null){
            instance = new Singleton();
        }
         return instance;
    }

  public static void dbconnect(){
      System.out.println("db connection");
  }

}
