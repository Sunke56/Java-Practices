package streams;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Mapping {

    public static void main(String[] args) {
        List<Integer> l1 = Arrays.asList(2,3,4,5);
        List<Integer> l2 = Arrays.asList(8,6,7,9);

        List<Integer> list1 = l1.stream().map(n->n*3).filter(n->n%2==0).collect(Collectors.toList());
        System.out.println(list1);

        Integer[] nums = {1,2,3,4,5};
        List<Integer> list = Arrays.stream(nums).map(n->n*2).collect(Collectors.toList());
        System.out.println(list);

    }
}
