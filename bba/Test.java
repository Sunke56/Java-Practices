package bba;

public class Test {
    int sum;
    public int add(int a,int b){
        return sum=a+b;
    }
    void follow(){
        System.out.println("This is Parent class");
    }
    void punish(){
        System.out.println("This is Parent punish");
    }

    public static void main(String[] args) {
        int age=10;
        Test t = new Test();
        System.out.println(t.add(2,3));
        Test t1 = new test2();
        t1.punish();
        t1.follow();
        test2 t3 = new test2();

    }

}
class test2 extends Test{
    int minus(int a,int b){
        return a - b;
    }
    void follow(String str){
        System.out.println(str);
    }
    void punish(){
        System.out.println("This is Child punish");
    }

}