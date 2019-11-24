public class Dog{
	//public int size;
	int size;
	public Dog(int s){
		size = s;
	}/* Constructor: Not a method
	determines how to instantiate the class */
	public void makeNoise(){
		if (size<20){
			System.out.println("ho");
		} else {
			System.out.println("wow"); 
		} 
	}//do not hava return value
	/*Return the max size dog*/
	public static Dog maxDog(Dog d1, Dog d2)
	{
		if(d1.size > d2.size)//call the global size not the ont inside the method
		{
			return d1;
		}
		else {
			return d2;
		}
	}
	public Dog maxDog2(Dog otherDog){
		if(size > otherDog.size)//call the global size not the ont inside the method
		{
			return this;
		}
		else {
			return otherDog;
		}
	}//non-static but have return value
}
