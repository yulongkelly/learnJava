public class Dog{
	public int size;
	
	public Dog(int s){
		size=s;
	}
	public void makeNoise(){
		if (size<20){
			System.out.println("ho");
		} else {
			System.out.println("wow");
		}
	}
}
