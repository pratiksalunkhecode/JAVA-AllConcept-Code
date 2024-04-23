package Stream_demo;

import java.util.Arrays;
import java.util.List;

public class stringStream {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("aratik","Ram","Laxman","ok");

      list.stream().filter(x->x.startsWith("a")).forEach(System.out::println);

      list.stream().filter(a-> stratWithStream(a,"R")).forEach(System.out::println);
    }

    public static boolean stratWithStream(String s, String startWith){
        return s.startsWith(startWith);
    }

}
