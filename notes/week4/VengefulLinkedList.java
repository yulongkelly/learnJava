public class VengefulLinkedList<Item> extends LinkedListDeque<Item> {

	// hold the removed items
	private LinkedListDeque<Item> deletedItems;

	public VengefulLinkedList() {
		// Give deletedItems a place to hold the data
		deletedItems = new LinkedListDeque<Item>();  
	}

	@Override
	public Item removeLast() {
		// delete the last item --> Use superclass's method!
		// record the item that was deleted
		// return the deleted item
		Item removeItem = super.removeLast();
		deletedItems.addLast(removeItem);
		return removeItem;

	}

	public void printLostItems() {
		deletedItems.printDeque();
	}

	public static void main(String[] args) {
		
		VengefulLinkedList<Integer> vs1 = new VengefulLinkedList<Integer>();
		vs1.addLast(1);
		vs1.addLast(5);
		vs1.addLast(10);
		vs1.addLast(13);
		// vs1 is now: [1, 5, 10, 13] 
		vs1.removeLast();
		vs1.removeLast();
		// After deletion, vs1 is: [1, 5]
		// Should print out the numbers of the fallen, namely 10 and 13.
		System.out.print("The fallen are: ");
		vs1.printLostItems(); 
	}
}