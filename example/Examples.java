package example;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Examples {
    public static void main(String[] args) {
primeOrNot(4);
fibonacci(10);
        System.out.println("=========");
        System.out.println(factorial(4));
        System.out.println("=========");
        findGCD(15,48);

        String str = "Hello World";
        String[] ch =str.split("");
        List<String> l1 = Arrays.asList(ch);

        Map<String,Long> m1 = l1.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(m1);

    }
    public static void primeOrNot(int num){
        boolean flag = true;
        for(int i=2;i<=num-1;i++){
            if(num % i==0){
                flag = false;
                break;
            }
        }
      if(flag){
          System.out.println("Prime");
      }
      else {
          System.out.println("Not a Prime");
      }
    }

    public static int fibonacci(int num){
        int a=0,b=1,c = 0;
        System.out.println(a);
        System.out.println(b);
        for(int i =2;i<num;i++){
            c=a+b;
            System.out.println(c);
            a=b;
            b=c;
        }
        return c;
    }

    public static int factorial(int num2){
        int fact =1;
        for(int i=1;i<=num2;i++){
            fact = fact *i;
        }
        return fact;
    }

    public static void findGCD(int num1, int num2) {
        while (num2 != 0) {
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        System.out.println(num1);
    }

}
