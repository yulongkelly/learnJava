/* Represent a list of stuff, where all the list wowrk is delegated
** to a naked recursive data structure. */

public class SList_generic<Blorp>{
	public class Node {
		public Blorp item;
		public Node next;

		public Node(Blorp i, Node h) {
			item = i;
			next = h;
		}
	}

		public Node sentinel;

	private int size;

	public SList_generic(){
		sentinel = new Node(null, null);
		size = 0;
	}

	public SList_generic(Blorp x) {
		sentinel = new Node(null, null);
		sentinel.next = new Node(x, null);
		size = 1;
	} 

	
	public void addFirst(Blorp x) {
		sentinel.next = new Node(x, sentinel.next);
		size = size + 1;
	}


	public int size() {
		return size;
	}

	public static void main(String[] args) {
		SList_generic<Integer> L = new SList_generic<Integer>(10);
		L.addFirst(10);
		System.out.println(L.size());
	}


}