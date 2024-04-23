package Interface_demo.session2interface;

public class finallyExecution {

    public static int main() {

      try{
          return 1;
      }finally {
          return 2;  // finally executed
      }
    }

    public static void main(String[] args) {


        System.out.println(main());

    }

}
