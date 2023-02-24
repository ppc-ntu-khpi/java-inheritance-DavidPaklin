public class Bear extends Predator {
    private String kind;
    public Bear(String name, int weight, String kind) {
        this.name = name;
        this.weight = weight;
        this.kind = kind;
    }
    public Bear() {
        this("Fluffy", 500, "brown bear");
    }
    public Bear(String name) {
        this(name, 500, "brown bear");
    }
    public void play() {
        System.out.println("Bear is walking and playing");
    }
    public void hunt() {
        System.out.println("Bear hunting for a fish");
    }
    public String toString() {
        return super.toString() + "\nKind:\t" + this.kind + "\n\nThis is Bear";
    }
    public void speak() {
        System.out.println("Bear is growling");
    }
    public void eat() {
        System.out.println("Bear eats fish");
    }
}
