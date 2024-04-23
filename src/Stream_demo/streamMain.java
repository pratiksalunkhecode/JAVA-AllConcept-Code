package Stream_demo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class streamMain {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(2,3,4,5,6,7);


        System.out.println(list.stream().count());

        System.out.println( list.stream().filter(x -> x % 2 == 0).collect(Collectors.toList()));
         
        
        System.out.println(list.stream().map(x->x-1).collect(Collectors.toList()));
        System.out.println("=================");
        System.out.println(list);
        list = list.stream().filter(x->x%2==0).collect(Collectors.toList()); //x%2==0 predicate
        //collector is class inside the class function called toconvert into a list or set etc....

        System.out.println(list);

        //without modify a current array we can create new and store your output
       List<Integer> list1 = list.stream().filter(x->x%2==0).map(x->x*x).sorted().collect(Collectors.toList());

        System.out.println(list1); // changing list // because ill store new element inside the existing array
  // when you want to apply a ope on all the function the will use map
        // if you want filter your collection then use filter
// data is store inside the jvm
        System.out.println("count using method");
        System.out.println(count1(list));

    }

    public static List<Integer> count1(List<Integer> list){
        return list.stream().collect(Collectors.toList());
    }

}
// map is intermidiate operator
//forEach is terminal operator


/*
primary usage
filtering,pre-processing,conversion,reduction.grouping,count,distinct

before final whatever operation we are doing this is the preprocessing

 */