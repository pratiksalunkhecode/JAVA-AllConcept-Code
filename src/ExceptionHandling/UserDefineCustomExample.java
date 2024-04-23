package ExceptionHandling;

public class UserDefineCustomExample{

    public static void main(String[] args) throws invalidAgeException {

        User u = new User();
        u.register("Pratik", 25, "pratik@123.com");
        u.register("Pratik", 12, "pratik@123.com");

    }

}
