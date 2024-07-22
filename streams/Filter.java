package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Filter {
    public static void main(String[] args) {
        List<Integer> l1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 19);
        List<Integer> l2 = l1.stream().filter(n -> n % 2 == 0 && n>5 ).collect(Collectors.toList());
        System.out.println(l2);

        List<Employee1> emp = new ArrayList<>();
        emp.add(new Employee1("Shiv", 20000L));
        emp.add(new Employee1("paWan", 30000L));
        emp.add(new Employee1("Ravi", 40000L));
        emp.add(new Employee1("Suresh", 50000L));
        emp.stream().filter(e->e.getSalary()>40000L)
                .forEach(n -> System.out.println(n.getName()));


    }
}
