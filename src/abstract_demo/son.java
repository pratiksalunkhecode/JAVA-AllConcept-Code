package abstract_demo;

public class son extends parent{

    @Override
    void normalMethod() {
        super.normalMethod();
        System.out.println("normal");
    }

    public son(int age){
        super(age);

    }

    @Override
    void city(){
        super.normalMethod();
        System.out.println("delhi");
    }

    @Override
    void carrier() {
        System.out.println("im a coder");
    }

}
