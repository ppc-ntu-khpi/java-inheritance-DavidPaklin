public class TestAnimal {

/** 
 *
 * Main
 *
 * @param args  the args
 */
    public static void main(String[] args) { 

        Bear bear = new Bear("Winnie the Pooh");
        System.out.println(bear);
        bear.hunt();
        bear.eat();
        bear.speak();
        bear.play();
        Animal animal = new Animal();
        System.out.println(animal);
        animal.eat();
        animal.speak();
    }
}
