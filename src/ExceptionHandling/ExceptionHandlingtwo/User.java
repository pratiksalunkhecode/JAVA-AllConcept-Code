package ExceptionHandling.ExceptionHandlingtwo;

import ExceptionHandling.invalidAgeException;

import java.util.ArrayList;
import java.util.List;

public class User  {

    String name;
    int age;
    String address;

    public User(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }


    public String registration(String name, int age, String address) throws invalidAgeException{
    if(age < 18){
        try {
            throw new invalidAgeException("your entered age is :"+age+"age should be needed");

        } catch (invalidAgeException e) {
            throw new RuntimeException(e);
        }finally {
            System.out.println("finally");
        }
    }else{
            this.name=name;
            this.age=age;
            this.address=address;
    }


        return name;
    }

    public static void main(String[] args) throws IndexOutOfBoundsException, ArithmeticException, invalidAgeException {

        List<Integer> s = new ArrayList<>(10);
        s.add(10);
        s.add(10);
        s.add(10);
        s.add(10);
        s.add(10);
        try {
            System.out.println(s.get(15));
        } catch (IndexOutOfBoundsException e) {
            System.out.println("You try to access index out of bound plz try to access index below " + s.getLast());
        }

        try {
            throw new ArithmeticException("you cant divide by zero try to another one" + 10 / 0);
        } catch (Exception e) {
            System.out.println(" ok ");
        }







    }
}
