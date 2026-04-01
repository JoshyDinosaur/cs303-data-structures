README: CS-303 Assignment 2

Author: Joshua W. Dillard

Date: March 27, 2026

Course: CS-303: Data Structures
1. Project Overview
This assignment was my practice and undestanding for implementing two data structures, the Singly Linked List and the Stack. The primary goal is to understand the two data structures through implementing them from scratch/using already known data structures. Also, I would like for them to run without error.

2. Features & Functionality
Singly Linked List implements (7) useful methods, and (3) data fields in a class instance. The class also defines the Node instance. Mehods correctly update head, tail and size for each of the implemented methods.

Stack implements six methods using the java ArrayList<> as a backing field. Its functionality is displayed in the push, pop, peek, avearage and isEmpty performance in a main method. The class handles error cases by throwing java appropriate exceptions.

3. Technical Implementation
A custom class Node and was created to implement the Singly Linked List.

4. Complexity Analysis

Time Complexity:
O(1):
    -addAtHead()
    -deleteAtHead()
    -getHead()
    ---------------------
    -push()
    -pop()
    -peek()
    -isEmpty()
    -size()

O(n):
    -addAtTail()
    -getTail()
    -getIndex()
    -deleteTail()
    -deleteAtIndex()
    -search()
    ---------------------
    -average()

5. Known Issues / Constraints
None