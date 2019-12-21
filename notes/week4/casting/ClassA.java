public class ClassA {
	public int x = 5;
	public ClassA m1() {
		System.out.println("Am1-> " + x);
		return this;
	}
	public void m2() {System.out.println("Am2-> " + this.x);}
	public void update() {x = 99;}
}