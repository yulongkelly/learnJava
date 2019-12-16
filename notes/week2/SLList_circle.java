public class SLList_circle{
	private NewIntNode sentinel;

	public SLList_circle() {
		sentinel = new NewIntNode(null, 63, null);
		sentinel.previous = sentinel;
		sentinel.next = sentinel;
	}
	
	public SLList_circle(int x) {
		sentinel = new NewIntNode(null, 63, null);
		sentinel.next = new NewIntNode(sentinel, x, sentinel);
		sentinel.previous = sentinel.next;
	} 
	public void addFirst(int x){
		sentinel.next = new NewIntNode(sentinel, x, sentinel.next);
      sentinel.next.next.previous = sentinel.next;
      sentinel.previous = sentinel.next.next;
	}
	public void addLast(int x){
		sentinel.previous.next = new NewIntNode(sentinel.previous, x, sentinel);
		sentinel.previous = sentinel.previous.next;
	}
	public void deleteLast(){
		sentinel.previous.previous.next = sentinel;
		sentinel.previous = sentinel.previous.previous;
		//no pointer point to the last node, so the last node will be clear?
	}

	public static void main(String[] args){
     SLList_circle s = new SLList_circle(10);
      s.addFirst(20);
      s.addFirst(30);
      s.addLast(15);
	}
}