public class IntList {
	public int head;//first
	public IntList tail;//rest

	public IntList(int h, IntList t) {
		head = h;
		tail = t;
	}//constructor

	/* method 1
	public int length() {
		int length = 1;
		while(tail != null){
			tail = tail.tail;
			length++;
		}
		return length;
	}*/
	//method 2---recursion
	/* Return the number of integers in this IntList
	 * usimg recursion*/
	public int length() {
		if (tail == null) {
			return 1;
		}
		return 1 + tail.length();
	}

	/** Return the ith item of this IntList */
	public int get(int i) {
		if (i == 0) {
			return head;
		}

		return tail.get(i-1);
	}
// 	Returns an IntList identical to L, but with all values incremented by x.
// Values in L cannot change!
// Developed live in lecture.


	public static IntList incrList(IntList L, int x) {
		if(L == null) {
			return null;
		}
		IntList Q = new IntList(L.head+x, null);
		Q.tail = incrList(L.tail, x);
		return Q;

	}

	// Returns an IntList identical to L, but with all values incremented by x.
	// Not allowed to use ‘new’ (to save memory).

	public static IntList dincrList(IntList L, int x) {
		if (L == null) {
			return null;
		}
		L.head = L.head + x;
		// Don't really care about the return value here, because
		// we just change the value in the address imidiately
		dincrList(L.tail, x);
		return L;
	}


	public static void main(String[] args) {
		IntList L = new IntList(5, null);
		L = new IntList(10, L);//L in the bracket refer to old l
		L = new IntList(15, L);// as you may see L is grow!

		System.out.println(L.head);// print the first item in L
		System.out.println(L.tail.head);// print the second item in L
		System.out.println(L.length());
		System.out.println(L.get(1));
		System.out.println(L);
	}
}