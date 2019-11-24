public class DogLaunch{
	public static void main(String[] args) {
		Dog maya = new Dog(20);
		//Declaration of a dog varable. 20 is maya's size
		Dog tiny = new Dog(5);
		maya.makeNoise();
		/*invocation(use maya to call makeNoise, 
			because makenoise is an non-static method)*/
		//if makeNoise is an static method, it cannot access size!
		Dog larger = Dog.maxDog(maya, tiny);
		larger.makeNoise();
		//since maxDog is a static method, we use Dog to call the method.
		Dog large2 = maya.maxDog2(tiny);
		large2.makeNoise();
		// Compare maya to tiny
	}
}
