package bba;

public final class Immutable {
    private final int id;
    private final String name;
    private Engine engine;

    public Immutable(int id, String name, Engine e) {
        this.id = id;
        this.name = name;
        Engine e1 = new Engine(e.speed);
        this.engine = e1;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public static void main(String[] args) {
        Engine e = new Engine(50);
        Immutable a = new Immutable(1, "Shiva", e);
        System.out.println(a.name == "Shiva");
        System.out.println(a.engine.speed);
    }
}

