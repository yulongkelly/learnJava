public class ArgsDemo {
	public static void main(String[] args) {
		System.out.println(args[0]);
	}
}
/*we cannot call main directly, because remember we 
*just can call function in main method!
*/
/* So to initialize args(call main and give args a value
* we need to do this in terminal
* after compile, write java ArgsDemo a b c d
* and you successfully create args!!
*/
//why this useful tho
//just a behavior of commend line arguments:)