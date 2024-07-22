package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamMethods {
    public static void main(String[] args) {

        List<String> vehicles = Arrays.asList("car", "bike", "bus", "auto", "car", "bus");
        List<String> v1 =vehicles.stream().sorted().filter(n->n.length()>3).distinct().collect(Collectors.toList());
        System.out.println(v1);

        List<Integer> nums = Arrays.asList(2,3,4,6,7,5,3,4,5,8,9,10,19);
        nums.stream().sorted(Comparator.reverseOrder()).distinct().limit(3).forEach(System.out::println);

        System.out.println("==================");

        long n1=nums.stream().sorted(Comparator.reverseOrder()).distinct().limit(3).count();
        System.out.println(n1);

        System.out.println("==================");

        Optional<Integer> n2 =  nums.stream().max((a, b)->{return a.compareTo(b);});
        System.out.println(n2.get());

        System.out.println("==================");

        Optional<Integer> n3 =  nums.stream().min((a, b)->{return a.compareTo(b);});
        System.out.println(n3.get());

        System.out.println("==================");

        Optional<Integer> n4 =  nums.stream().reduce((combined,val)->{return combined+val ;});
        System.out.println(n4.get());
        System.out.println("==================");

        Object[] n5 = nums.stream().sorted(Comparator.reverseOrder()).distinct().limit(3).toArray();
        for(Object n6 :n5){
            System.out.println(n6);
        }


    }
}
