public class HoFDemo {
	public static int do_twice(??? f, int x) {
		return f(f(x));// call a function twice
		/** There isn't a type called function type 
		  * How can we define the parameter? */
	}

	public static void main(String[] args) {
		System.out.prinltn(do_twice(tenX, 2)); 
	}
}