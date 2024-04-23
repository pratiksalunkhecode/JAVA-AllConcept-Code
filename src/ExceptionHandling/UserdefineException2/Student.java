package ExceptionHandling.UserdefineException2;

public class Student {

    String name;
    int age;
    double roll;
    String address;

    public void studentData(String name, int age, double roll, String address) throws invalidAgeException{
        if(age < 18){
            throw new invalidAgeException("age should be greater then 18 :"+age);
        }else{
            this.name = name;
            this.age = age;
            this.roll = roll;
            this.address = address;
        }
    }

}
