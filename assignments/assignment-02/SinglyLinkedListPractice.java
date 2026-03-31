package SinglyLinkedList;


public class SinglyLinkedListPractice{
    
    public class Node{
        int data;
        Node next;
    }
    
    private Node head;
    private int size;

    public SinglyLinkedListPractice(){
        head = null;
        size = 0;
    }

    public void addAtHead(int value){
        Node newHead = new Node();
        newHead.data = value;
        newHead.next = head;
        head = newHead;
        size++;
    }

    public void addAtTail(int value){
        if(head == null){
            this.addAtHead(value);
            return;
        }
        Node newTail = new Node();
        newTail.data = value;
        Node current = head;
        while(current.next != null){
            current = current.next;
        }
        current.next = newTail;
        size++;
    }

    public int getIndex(int index){
        if(head == null){
            throw new IllegalStateException("SinglyLinkedList is empty");
        }
        if(index >= size || index < 0){
            throw new IllegalArgumentException("Index is invalid");
        }
        int nodeCount = 0;
        Node currentNode = head;
        while (nodeCount != index){
            currentNode = currentNode.next;
            nodeCount++;
        }
        return currentNode.data;
        
    }

    public int getHead(){
        return getIndex(0);
    }

    public int getTail(){
        return getIndex(this.size);
    }

    public void addAtIndex(int index, int value){
        if (index > size || index < 0){
            throw new IllegalArgumentException("Index is invalid");
        }
        if (index == 0){
            addAtHead(value);
            return;
        }
        if (index == size){
            addAtTail(value);
            return;
        }
        int currentNodeidx = 0;
        Node insertNode = new Node();
        insertNode.data = value;
        Node currentNode = head;
        while (currentNodeidx+1 != index){
            currentNode = currentNode.next;
            currentNodeidx++;
        }
        insertNode.next = currentNode.next;
        currentNode.next = insertNode;
        size++;
        return;
    }

    public void deleteAtHead(){
        if(head == null) {
            throw new IllegalArgumentException("List is empty");
        }
        if(head.next == null){
            head = null;
            size--;
            return;
        }
        head = head.next;
        size--;
        return;
    }
    
    public void deleteAtTail(){
        if(head == null){
            throw new IllegalArgumentException("List is empty");
        }
        if(head.next == null){
            head = null;
            size--;
            return;
        }
        Node currentNode = head;
        while (currentNode.next.next != null){
            currentNode = currentNode.next;
        }
        currentNode.next = null;
        size--;
    }

    public void deleteAtIndex(int index){
        if (head == null){
            throw new IllegalArgumentException("List is Empty");
        }
        if (index < 0 || index >= size){
            throw new IllegalArgumentException("Index is invalid");
        }
        if (index == size-1){
            deleteAtTail();
            return;
        }
        if (index == 0){
            deleteAtHead();
            return;
        }
        int currentIndex = 0;
        Node currentNode = head;
        while (currentIndex+1 != index){
            currentNode = currentNode.next;
            currentIndex++;
        }
        currentNode.next = currentNode.next.next;
        size--;
    }

    public int search(int value){
        if (head == null){
            return -1;
        }
        int searchIndex = 0;
        Node searchNode = head;
        while (searchNode.data != value){
            if (searchNode.next == null){
                return -1;
            }
            searchNode = searchNode.next;
            searchIndex++;
        }
        return searchIndex;
    }

    public void printList(){
        if (head == null){
            System.out.println("Empty");
            return;
        }
        Node currentNode = head;
        for(int i=0;i<size;i++){
            if (currentNode.next != null){
            System.out.print(currentNode.data +" ,");
            }else{
            System.out.println(currentNode.data);
            }
            currentNode = currentNode.next;
        }
    }

    public boolean isEmpty(){
        return (size == 0 && head == null);
    }
    public static void main(String[] args){
        SinglyLinkedListPractice joshSLL = new SinglyLinkedListPractice();
        joshSLL.addAtHead(6);
        joshSLL.addAtTail(3);
        joshSLL.addAtTail(8);
        joshSLL.addAtTail(9);
        joshSLL.addAtTail(1);
        joshSLL.addAtIndex(3, 6);
        joshSLL.addAtHead(joshSLL.search(6));;
        joshSLL.printList();
    }
}