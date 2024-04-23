package ExceptionHandling.UserdefineException2;

public class studentDriver {


    public static void main(String[] args) throws invalidAgeException {

        Student s = new Student();
        s.studentData("pratik",21, 1, "mumbai");
        s.studentData("pratik2", 2, 1, "mumbai");

    }

}
