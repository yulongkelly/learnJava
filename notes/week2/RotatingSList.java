/* SList, but with additional rotateRight operation. */
public class RotatingSList<Item> extends SList_generic<Item>{

    /** To do: Implement RotatingSList such that code compiles and outputs correct result. */

    public static void main(String[] args) {
        RotatingSList<Integer> rsl = new RotatingSList<Integer>();
        System.out.println(rsl.sentinel.item);
        /* Creates SList: [10, 11, 12, 13] */
        rsl.addFirst(10);
        rsl.addFirst(11);

        /* Should be: [13, 10, 11, 12] */
        
    }
}

