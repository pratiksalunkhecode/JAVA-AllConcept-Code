package Stream_demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class streamRevision {

    public static void main(String[] args) {

         List<Integer> list = Arrays.asList(10,20,30,40, 40);


        System.out.println(list.stream().count());
        System.out.println(list.stream().filter(x -> x > 20).collect(Collectors.toList()));
        System.out.println(list.stream().filter(x -> x % 2 == 0).collect(Collectors.toList()));
        System.out.println(list.stream().distinct().collect(Collectors.toList()));

        List<String> s = Arrays.asList("pratik","abhi","okok","byebye");

        System.out.println(s.stream().collect(Collectors.toList()));
        System.out.println(s.stream().filter(x -> x.startsWith("p")).filter(x -> x.endsWith("k"))
                                                                       .collect(Collectors.toList()));



          List<String> a1 = s.stream().filter(x -> x.startsWith("p")).collect(Collectors.toList());

        System.out.println(a1);


       s.stream().filter(a2 -> a2.startsWith("a")).forEach(System.out::println);



    }

}
