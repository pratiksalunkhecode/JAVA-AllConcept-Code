public class main_Explanation {
    static public void main(String[] prat) {
        System.out.println("main explanation");
       // main_Explanation.main(10);
        main_Explanation m = new main_Explanation();
//        m.main(90);
        m.main(10);
        m.main(10.8f);


    }
/*
overloading
static
compile time polymorphism
*/

   public void main(int a){
       System.out.println("this is my int method");
   }

    public void main(float a){
        System.out.println("this is my float method");
    }




}
