package lambda_Expression;

public class LambdaExample {

    public static void main(String[] args) throws ArithmeticException {

        MyFunctionalInterface myFunc = (s) -> System.out.println("My message: " + s);
        myFunc.myMethod("Hello, this coming from lambda example class");




    }


}
