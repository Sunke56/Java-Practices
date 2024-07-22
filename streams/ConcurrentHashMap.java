package streams;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ConcurrentHashMap {
    public static void main(String[] args) {
        String str = "Hi this is Shiva";
        List<String> list1 = Arrays.asList(str.split(" "));
        String str2 = list1.stream().collect(Collectors.joining("-"));
        System.out.println(str2);

        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {2, 4, 5, 6, 7};
        List<Integer> list4 = Arrays.stream(arr1).filter(numx ->
             Arrays.stream(arr2).anyMatch(arrnum ->
                 arrnum == numx)).boxed().collect(Collectors.toList());
        System.out.println(list4);



//        IntStream.range(0, arr1.length / 2).forEach((i) -> {
//            int temp = arr1[i];
//            arr1[i] = arr1[arr1.length - i - 1];
//            arr1[arr1.length - i - 1] = temp;
//        });
//        int[] var7 = arr1;
//        int var8 = arr1.length;
//
//        for(int var9 = 0; var9 < var8; ++var9) {
//            int num = var7[var9];
//            System.out.println(num + " ");
//        }

        String str5 = "good morning abcdahb";
        str5 = str5.replace(" ", "");
        List<String> m1 = Arrays.asList(str5.split(""));
        Set<String> set6 = new HashSet();
        Set<String> set3 = m1.stream().filter(x -> !set6.add(x)).collect(Collectors.toSet());
        System.out.println(set3);

        List<Integer> l1 =Arrays.asList(1,2,3,4,5,6,7,4,2,5);

        Map<Integer, Long> map1 =l1.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        List<Integer> l2 = map1.entrySet().stream().filter(e->e.getValue()>1).map(e->e.getKey()).collect(Collectors.toList());
        System.out.println(l2);

    }

}
