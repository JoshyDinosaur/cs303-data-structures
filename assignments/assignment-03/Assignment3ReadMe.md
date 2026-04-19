
This file is the ReadMe for understanding and running the code of Assignment 3.

------------------------------
JoshQueue
------------------------------

JoshQueue is an implementation of a Queue via a Linked List backing object.
The class exposes (5) methods that provide the functionality of a Queue data structure: offer(), poll(), peek(), size() and empty().
The class is template and works with any data type <T>.

Running the main function defined in this class will perform operations that verify functionality of the  data structure:
(1) Instantiate Josh's 10 favorite integers. (utilize offer)
(2) Display all elements above. (utilize poll)

<img width="801" height="214" alt="Screenshot 2026-04-19 at 3 05 23 PM" src="https://github.com/user-attachments/assets/680e5ed7-d607-4bd2-a39b-2ff4b8135a2e" />![Uploading Screenshot 2026-04-19 at 3.16.15 PM.png…]()


------------------------------
JoshRecursion
------------------------------

JoshRecursion utilizes two methods to perform the recursive linear function to find last occurence of a target in a ArrayList. The first method is used to hold the target value and initiate the search while providing the starting index for the second function to use for modification. The second method is a helper that makes the recursive calls that build up the call stack up to the base case.

The base cases are: the target is found, the list is exhausted. If neither is the case, the algorithm executes the recursive step.

<img width="810" height="107" alt="Screenshot 2026-04-19 at 3 16 48 PM" src="https://github.com/user-attachments/assets/c9a6ffb8-c36b-43ab-9445-9e557792f6b6" />

------------------------------
insertionSort
------------------------------

The modification of insertionSort source so that it can sort a linked list of integers required a shif to focus on Array .get() and .set() insted of index[]. In a linked list there is a chain of nodes and we can only travel forward. Hence we use an ArrayList and sort the linked list using index-based logic similar to an array sort.

There is two loops. The outer loop uses index j as a boundary. It captures the first unsorted item, key, as the boundary.

The inner loop uses an index, i, to scan in the opposited direction from the sorted/unsorted boundary. Comparing key to the element at .get(i) we are able to locate the correct position and insert into a final sorted position.
