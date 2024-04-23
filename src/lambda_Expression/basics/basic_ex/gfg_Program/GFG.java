package lambda_Expression.basics.basic_ex.gfg_Program;

public class GFG {

//    static void fun(test t){
//        t.print();
//    }

//    static void fun(test t,Integer p)
//    {
//        t.print(p);
//    }

    static void fun(test t, Integer p, Integer p1){
        t.print(p,p1);
    }

//    public static void main(String[] args) {
//        fun(()-> System.out.println("hello"));
//    }

//    public static void main(String[] args) {
//        fun(p -> System.out.println(p),10);
//    }

    public static void main(String[] args) {
        fun((p, p1) -> System.out.println(p+" "+ p1), 10,20);
    }



}
