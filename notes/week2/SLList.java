public class SLList {

	private IntNode first;
	//create a 64 bits space for first as a type of IntNode
	//cannot be used outside of the class

	private int size;

	public SLList() {
		first = null;
		size = 0;

	}
	public SLList(int x) {
		first = new IntNode(x, null);
		size = 1;
	} 

	public void addFirst(int x) {
		first = new IntNode(x, first);
		size = size + 1;
	}

	public void addLast(int x) {
	      IntNode p = first;
      while(p.next != null) {
	         p = p.next;
	  } 
	      p.next = new IntNode(x, null);
	      size = size + 1;
	}
	

/** My method--using while loop
* public int size() {
		IntNode p = first;
		int size = 0;
		while(p != null){
			p = p.next;
			size++;
		}
		return size;
	}
*/
	/** method 2
	private int size(IntNode p) {
		if (p.next ==null){
			return 1;
		}

		return 1 + size(p.next);
	}
	public int size() {
		return size(first);
	} */

	public int size() {
		return size;
	}

	public static void main(String[] args) {
		SLList L = new SLList(10);
		L.addFirst(10);
		System.out.println(L.size());
	}

}

//note1
/* It is hard to create addFirst in IntList,
** mainly beacause there is no public variable the same as L.
*/

//note2
/**
* you can bring IntNode in to SLList class---called nested class
*/

//note3
/**
* stacic class never use any variable from outside.
*/
