/** Tests the methods of the Sort class */
/* Write unit tests before code. */
import org.junit.Test;
import static org.junit.Assert.*;

public class TestSort {

	/** Tests the Sort.sort method. */
	public static void testSort(){
		String[] input = {"a", "c", "e", "b"};
		String[] expected = {"a", "b", "c", "e"};
		String[] actual = Sort.sort(input);

		assertArrayEquals(expected, actual);

		/* Don't do this, it's boring and not accurate
		if(expect.length != actual.length){
			System.out.println("Length mismatch");
			System.out.println("expected was length of " + expected.length);
			System,out.println("actual was length of "+actual.length);
		} 
		*/
	}
	@Test
	public void testIndexOfSmallest() {
		String[] inputs = {"milvia", "zero", "josh", "trump"};
		int expected = 2;
		int actual = Sort.indexOfSmallest(inputs, 2);

		assertEquals(expected, actual);

		expected = 3;
		actual = Sort.indexOfSmallest(inputs, 3);
		assertEquals(expected, actual);

	}

	public static void main(String[] args) {
		jh61b.junit.TestRunner.runTests("all", TestSort.class);
	}
}

