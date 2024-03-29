import java.util.Comparator;

public class Dog implements Comparable<Dog> {
    private String name;
    private int size;

    public Dog(String n, int s) {
        name = n;
        size = s;
    }

    /* We are going to do a more restricted thing,
     * than demanded by the API. So I'm
     * just going to assume the o is a dog.
     * I just don't know how to compare myself to
     * lettuce.
     */
    // public int compareTo(Dog x) {
    //     return this.size - x.size;
    // }

    public void bark() {
        System.out.println(name + " says: bark");
    }

    private static class  NameComparator implements Comparator<Dog> {
        public int compare(Dog x, Dog y) {
            return x.name.compareTo(y.name);
        }
    }

    // public static Comparator<Dog> getNameComparator() {
    //     return new NameComparator();
    // }
 }