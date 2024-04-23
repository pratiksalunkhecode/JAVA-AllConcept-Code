package ExceptionHandling;

public class User {

    String name;
    int age;
    String email;

    public void register(String name, int age, String email) throws invalidAgeException {

        if(age<18){
            throw new invalidAgeException("age should be >18 : received age is: "+age);
        }else{

            this.email=email;
            this.name=name;
            this.age=age;
        }

    }


}
