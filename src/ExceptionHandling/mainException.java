package ExceptionHandling;

public class mainException {

    public static void main(String[] args) {

         mainException.exceptionWithThrows();
//        System.out.println("before");
//        System.out.println("divide by zero"+10/0); // due to unexpectde event flow is disrupt here not execute further program
//        System.out.println("After");


        System.out.println("before");
        try {
            System.out.println("divide by zero" + 10 / 0); // due to unexpectde event flow is disrupt here not execute further program
        }catch (ArithmeticException e){
            //System.out.println(e.getMessage());
            /*
            The catch block uses printStackTrace() to display information about where the exception occurred
            and the method calls leading to it. This can be valuable for diagnosing and fixing errors in your cod
             */
            //e.printStackTrace();

            if(e.getMessage().equals("/ by zero")){
                System.out.println("Divide by zero");
                // we can alter a default behaviour
            }
        }
        System.out.println("After");

    }


    static void exceptionWithThrows() throws ArithmeticException{

            System.out.println("the arithmatic excception :" + 10 / 0);

        }

    }



