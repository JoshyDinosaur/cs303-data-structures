package assignments;
import SinglyLinkedList.SinglyLinkedListPractice;

public class insertionSort {
    // pass in a LinkedList to be sorted w/o returning
    public static void insertionSort(SinglyLinkedListPractice<Integer> numList){
        int i, j, key;
        boolean insertionNeeded = false;

        // Outer Loop: set unsorted barrier 'j' , make it first key for advancing right
        for (j= 1; j < numList.size(); j++) {
            key = numList.get(j);
            insertionNeeded = false;

            // Inner Loop: set i as one item left of unsorted/sorted barrier, advance left
            for (i = j -1; i >= 0; i--){
                // perform comparison of key and current item
                if (key < numList.get(i)) {
                    // if current sorted item is greater than unsorted key, shift sorted item right
                    numList.set(i + 1, numList.get(i));
                    insertionNeeded = true;
                } else {
                    break;
                }
            }
            if (insertionNeeded) {
                numList.set(i+1, key);
            }
        }
    }
}
