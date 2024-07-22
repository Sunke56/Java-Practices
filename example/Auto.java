package example;

public class Auto implements Vehicle{
    @Override
    public void Wheels() {
        System.out.println("Having 3 wheels");
    }

    public static void main(String[] args) {
        Vehicle v1 =new Auto();
        v1.Wheels();

        Vehicle v2 = new Car();
        v2.Wheels();

        Vehicle v3 = () -> {
            System.out.println("Having 2 wheels");
        };
        v3.Wheels();
    }
}
