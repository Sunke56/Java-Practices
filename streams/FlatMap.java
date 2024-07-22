package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMap {
    public static void main(String[] args) {
        List<Integer> l1 = Arrays.asList(1,2,4,3);
        List<Integer> l2 = Arrays.asList(7,9,8,6);
        List<List<Integer>> l3 = Arrays.asList(l1,l2);

        List<Integer> list =l3.stream().flatMap(s->s.stream()).map(n->n*3).collect(Collectors.toList());
        System.out.println(list);

        List<Employee1> e1 = new ArrayList<>();
        e1.add(new Employee1("Shiv",20000L));
        e1.add(new Employee1("Pavan",30000L));
        e1.add(new Employee1("Koti",50000L));

        List<Employee1> e2 = new ArrayList<>();
        e1.add(new Employee1("Kumar",12000L));
        e1.add(new Employee1("Naga",320000L));
        e1.add(new Employee1("Pranay",52000L));

        List<List<Employee1>> emp =Arrays.asList(e1,e2);

        List<String> empls = emp.stream().flatMap(n->n.stream()).filter(e->e.getSalary()>30000).map(Employee1::getName).collect(Collectors.toList());
        System.out.println(empls);



    }





}
