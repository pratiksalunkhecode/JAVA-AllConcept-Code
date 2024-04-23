package Interface_demo.session2interface;

public interface Area {

   public void area();

   default void testdefault(){
      System.out.println("This is default method");
   }

   static void displayArea(){
      System.out.println("The area display called"+10/0);
   }

}
