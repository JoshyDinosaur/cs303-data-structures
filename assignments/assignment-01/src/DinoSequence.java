import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DinoSequence {
    private static final int INITIAL_CAPACITY = 10;
    private int[] theDataArray;
    private int current_size;
    private int current_capacity;
    
    public DinoSequence(int capacity) {
        if (capacity <= 0) {
            capacity = INITIAL_CAPACITY;
        }
        
        this.current_capacity = capacity;
        this.theDataArray = new int[this.current_capacity];
        this.current_size = 0;
    }
    
    public int Number_Check(int Desired_Num) {
        for (int i = 0; i < current_size; i++) {
            if (theDataArray[i] == Desired_Num) {
                return i;
            }
        }
        return -1;
    }
    
    public int[] Number_Modifier(int Index_Num, int Desired_Num) {
        if (Index_Num < 0 || Index_Num >= current_size) {
            throw new IndexOutOfBoundsException("Index " + Index_Num + " is out of bounds. Valid range: 0-" + (current_size - 1));
        }
        
        int oldValue = theDataArray[Index_Num];
        theDataArray[Index_Num] = Desired_Num;
        
        return new int[]{oldValue, Desired_Num};
    }
    
    public void Number_End_Add(int Added_Num) {
        if (current_size == current_capacity) {
            int updated_capacity = current_capacity * 2;
            int[] newArray = new int[updated_capacity];
            
            for (int i = 0; i < current_size; i++) {
                newArray[i] = theDataArray[i];
            }
            
            theDataArray = newArray;
            current_capacity = updated_capacity;
        }
    
        theDataArray[current_size] = Added_Num;
        current_size++;
    }
    
    public int Number_Remove(int Index_Num) {
        if (Index_Num < 0 || Index_Num >= current_size) {
            throw new IndexOutOfBoundsException("Index " + Index_Num + " is out of bounds. Valid range: 0-" + (current_size - 1));
        }
        
        int removedValue = theDataArray[Index_Num];
        
        for (int i = Index_Num; i < current_size - 1; i++) {
            theDataArray[i] = theDataArray[i + 1];
        }
        
        current_size--;
        return removedValue;
    }
    
    public void LoadFromFile(String filename) {
        try (Scanner fileScanner = new Scanner(new File(filename))) {
            while (fileScanner.hasNext()) {
                if (fileScanner.hasNextInt()) {
                    int nextInt = fileScanner.nextInt();
                    Number_End_Add(nextInt);
                } else {
                    fileScanner.next();
                }
            }
            System.out.println("File loaded successfully. " + current_size + " elements loaded.");
        } catch (FileNotFoundException e) {
            System.out.println("Error: File '" + filename + "' not found.");
        } catch (Exception e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
    
    public void display() {
        if (current_size == 0) {
            System.out.println("Array is empty.");
            return;
        }
        
        System.out.print("Current array: [");
        for (int i = 0; i < current_size; i++) {
            System.out.print(theDataArray[i]);
            if (i < current_size - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
        System.out.println("Size: " + current_size + " | Capacity: " + current_capacity);
    }
}