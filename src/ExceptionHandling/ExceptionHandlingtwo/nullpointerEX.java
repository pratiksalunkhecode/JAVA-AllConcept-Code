package ExceptionHandling.ExceptionHandlingtwo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class nullpointerEX {

    public static void main(String[] args) {

        System.out.println("before");
        try {
            System.out.println(10 / 0);

            File f1 = new File("/test.txt");
            Scanner myReader = new Scanner(f1);

        }catch(FileNotFoundException e){

            e.printStackTrace();

        } catch (ArithmeticException e){

                    if(e.getMessage() == "/ by zero") {
                        System.out.println("check you have divide by zero");

                    }
         //   PrintStream err = System.err;
          //  System.out.println(e.getMessage());
            // System.exit(10);
        }catch (Exception e){

        }finally {
            // close the datbase connection
            // clean up activity
            // variable dealocation etc etc.........
            // in every case finally will be execute except system.exit.
            System.out.println("finally");

        }
        System.out.println("after");


    }

}
