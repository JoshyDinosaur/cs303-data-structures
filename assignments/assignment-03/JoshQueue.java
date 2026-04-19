package assignments;

public class JoshQueue<T> {
    public class Node{
        T data;
        Node nextNode;
    }
    int size;
    Node head = null;
    Node tail = null;


    /**
     * Inserts item at the rear of queue, returns true if successful
     * If null is attempted, item will not be inserted, return false
     */   
    public boolean offer(T item){
        if(item != null){
            Node newNode = new Node();
            newNode.data = item;
            if (head == null){
                this.head = newNode;
                this.tail = newNode;
                size++;
                return true;
            }
            this.tail.nextNode = newNode;
            this.tail = newNode;
            size++;
            return true;
        }
        else {
            return false;
        }
    }
    
    /**
     * Method to remove entry at front of queue and return, if queue is non-empty.
     * If empty, return null
     */
    public T poll(){
        if(head == null){
            return null;
        }
        if(size == 1){
            Node value = head;
            head = null;
            tail = null;
            size--;
            return value.data;
        }
        else {
            Node returnNode = this.head;
            this.head = this.head.nextNode;
            size--;
            if (size == 1){
                this.tail = this.head;
            }
            return returnNode.data;
        }
    }

    /**
     * Returns entry at front of queue. No removal.
     * If empty, return null
     */
    public T peek(){
        if (head == null){
            return null;
        }
        return this.head.data;
    }

    /**
     * Returns the size (number of entries) in current queue
     */
    public int size(){
        return size;
    }

    /**
     * Returns true if the current queue is empty.
     * Returns false otherwise
     */
    public boolean empty(){
        return (size == 0);
    }

    /**
     * Moves element at front of queue to las element of queue.
     * Initial 2nd element will become first/head element post move.
     */
    public void move_to_rear(){
        if (this.peek() != null)
            {T element_to_move = this.poll();
            this.offer(element_to_move);}
    }

    public static void main(String[] args){
        JoshQueue<Integer> integerQueue = new JoshQueue<>();
        integerQueue.offer(6);
        integerQueue.offer(75);
        integerQueue.offer(64);
        integerQueue.offer(1);
        integerQueue.offer(7);
        integerQueue.offer(8);
        integerQueue.offer(86);
        integerQueue.offer(7);
        integerQueue.offer(10);
        integerQueue.offer(19);
        for(int i=0;i<10;i++){
            int currentElement = integerQueue.poll();
            System.out.println("Current element: " + currentElement);
        }
    }
}
