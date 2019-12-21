import java.util.Comparator;

public class DogLauncher {
	public static void main(String[] args) {
		Dog d1 = new Dog("S", 3);
		Dog d2 = new Dog("T", 4);
		// Comparator<Dog> nc = new Dog.getNameComparator();
		Dog.NameComparator nc = new Dog.NameComparator();
		if (nc.compare(d1, d2)>0) {
			d1.bark();
		} else {
			d2.bark();
		}
	}
}