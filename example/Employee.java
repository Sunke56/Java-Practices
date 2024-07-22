package example;
import java.util.*;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Employee {
    private String name;
    private int id;
    private String city;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getId() {
        return this.id;
    }

    public String getCity() {
        return this.city;
    }

    public Employee(String name, int id, String city) {
        this.name = name;
        this.id = id;
        this.city = city;
    }

    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList();
        employeeList.add(new Employee("Shiva", 1, "Bagalore"));
        employeeList.add(new Employee("Karthik", 2, "Chennai"));
        employeeList.add(new Employee("Pavan", 3, "Hyd"));
        Map<String, List<Employee>> emp = employeeList.stream().collect(Collectors.groupingBy(Employee::getCity));
        emp.forEach((key, value) -> {
            System.out.println("city :" + key + "  Employee:" + String.valueOf(value));
        });

        List<String> name = employeeList.stream().filter(emp1 -> emp1.getName().length() > 5)
                .map(Employee::getName).collect(Collectors.toList());
        System.out.println(name);

        String input = "Hello how are you";
        String[] strArr = input.split(" ");
        StringJoiner joiner = new StringJoiner("-", "[", "]");

        String[] var7 = strArr;
        int var8 = strArr.length;
        for (int var9 = 0; var9 < var8; ++var9) {
            String str = var7[var9];
            joiner.add(str);
        }
        System.out.println(joiner);

        Integer[] value1 = {1, 3, 2, 4, 34, 56, 898, 1, 2, 5, 3, 22, 43};
        Integer value2 = Arrays.stream(value1).distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        System.out.println(value2);


        String str = "hi hello goodEvening hi hello namaste";
        String[] str2 = str.split(" ");
        Map<String, Long> map1 = Arrays.stream(str2).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        List<String> repeated =map1.entrySet().stream().filter(a -> a.getValue() > 1) .map(Map.Entry::getKey).collect(Collectors.toList());
        System.out.println(repeated);

    }

    }

