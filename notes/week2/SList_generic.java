/* Represent a list of stuff, where all the list wowrk is delegated
** to a naked recursive data structure. */

public class Slist_generic<Blorp> {
	public class Node {
		public Blorp item;
		public Node next;

		public Node(Blorp i, Node h) {
			item = i;
			next = h;
		}

		private Node sentinel;

	private int size;

	public SLList_generic() {
		sentinel = new Node(null, null);
		size = 0;
	}
	
	public SLList_generic(Blorp x) {
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
		SLList_generic L = new SLList_generic(10);
		L.addFirst(10);
		System.out.println(L.size());
	}


	}
}