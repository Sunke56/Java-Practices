package bba;

public class Singletone  {
    private static Singletone instance;

    private Singletone() {
    }

    public static synchronized Singletone getInstance() {
        if (instance == null) {
            instance = new Singletone();
        }

        return instance;
    }

    public static void main(String[] args) {
        Singletone s1 = getInstance();
        Singletone s2 = getInstance();
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
    }
}
