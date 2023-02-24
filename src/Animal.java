public class Animal {
    protected String name;
    protected int weight;
    public Animal() {
        name = "generic animal";
        weight = 30;
    }
    public void eat() {
        System.out.println("Animal eating");
    }
    public void speak() {
        System.out.println("Animal speaking");
    }
    public String toString() {
        return "\nMy animal:" + "\nName:\t" + name + "\nWeight:\t" + weight + " kg";
    }
}
