package abstract_demo;

public class daughter extends parent{

   public daughter(int age){
        super(age);
    }
    @Override
    void city(){
        System.out.println("delhi 2");
    }

    @Override
    void carrier(){
        System.out.println("im a java devloper");
    }

}
