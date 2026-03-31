package Stacks;
import java.util.ArrayList;

public class StackPractice{
    private ArrayList<Integer> stack;

    public StackPractice(int capacity){
        this.stack =  new ArrayList<Integer>(capacity);
    }

    public void push(int value){
        this.stack.add(value);
    }

    public int pop(){
        return this.stack.removeLast();
    }

    public int peek(){
        return this.stack.getLast();
    }

    public boolean isEmpty(){
        return (this.stack.size() == 0);
    }

    public int size(){
        return this.stack.size();
    }

    public double average(){
        double sum = 0;
        for (int val : this.stack){
            sum+=(double)val;
        }
        if (this.stack.size() == 0)
            throw new IllegalArgumentException();
        return sum/this.stack.size();
    }

    public static void main(String[] args){
        //call isEmpty, push, pop, peek, average
        StackPractice myStack = new StackPractice(10);
        myStack.isEmpty();
        myStack.push(6);
        myStack.push(75);
        myStack.push(8);
        int topValue = myStack.pop();
        int peekValue = myStack.peek();
        myStack.average();
        System.out.println("Top Value: " + topValue);
        System.out.print("Peek Value: " + peekValue);
    }
}

