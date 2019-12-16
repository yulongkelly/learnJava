/** Array based list.
 *  @author Josh Hug
 */

public class AList {
    /* the stored integers */
    int[] items;
     int size;

    /** Creates an empty list. */
    public AList() {
        size = 0; 
        items = new int[10];
    }

    /* resizing our backing array */
    public void resize（){
            int[] newarray = int[size+1];
            System.arraycopy(items, 0, a, 0, size); 
            item = newarray;
}

    /** Inserts X into the back of the list. */
    public void insertBack(int x) {
        if(size == item.length){
            resize();
        }
        int[size] = x;
        size = size + 1;
    }

    /** Returns the item from the back of the list. */
    public int getBack() {
        int x = size - 1;
        return int[x];        
    }
    /** Gets the ith item in the list (0 is the front). */
    public int get(int i) {
        return int[i];        
    }

    /** Deletes item from back of the list and
      * returns deleted item. */
    public int deleteBack() {
        int x = size - 1;
        int back = int[x];
        size = size - 1;
        /* not neccessary since the size will decrease by one, 
         * but it is a good habbit and we will see why soon. */
        int[x] = 0;
        return back;
    }

    /** Returns the number of items in the list. */
    public int size() {
        return size;        
    }
} 

/* A list Invariants:
 *       1.THe position of the next item to be inserted is always zero
 *       2. size is always the number of items in the AList
 *       3. The last item in the list is always size-1