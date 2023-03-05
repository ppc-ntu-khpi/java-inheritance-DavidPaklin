public class Bear extends Predator {
    private String kind;

/** 
 *
 * Bear
 *
 * @param name  the name
 * @param weight  the weight
 * @param kind  the kind
 */
    public Bear(String name, int weight, String kind) { 

        this.name = name;
        this.weight = weight;
        this.kind = kind;
    }

/** 
 *
 * Bear
 * default constructor
 *
 */
    public Bear() { 

        this("Fluffy", 500, "brown bear");
    }

/** 
 *
 * Bear
 * constructor that accepts a name
 * @param name  the name
 */
    public Bear(String name) { 

        this(name, 500, "brown bear");
    }

/** 
 *
 * Play
 * method for text output
 */
    public void play() { 

        System.out.println("Bear is walking and playing");
    }

/** 
 *
 * Hunt
 * method for text output
 */
    public void hunt() { 

        System.out.println("Bear hunting for a fish");
    }

/** 
 *
 * To string
 *
 * @return String
 */
    public String toString() { 

        return super.toString() + "\nKind:\t" + this.kind + "\n\nThis is Bear";
    }

/** 
 *
 * Speak
 * method for text output
 */
    public void speak() { 

        System.out.println("Bear is growling");
    }

/** 
 *
 * Eat
 * method for text output
 */
    public void eat() { 

        System.out.println("Bear eats fish");
    }
}
