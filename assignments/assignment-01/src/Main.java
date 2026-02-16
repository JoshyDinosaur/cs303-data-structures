import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DinoSequence sequence = new DinoSequence(100);
        
        sequence.LoadFromFile("input.txt");
        
        Scanner scanner = new Scanner(System.in);
        boolean running = true;
        
        while (running) {
            displayMenu();
            int choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.print("Enter number to find: ");
                    int search_int = scanner.nextInt();
                    int found_idx = sequence.Number_Check(search_int);
                    
                    if (found_idx != -1) {
                        System.out.println("Found at index: " + found_idx);
                    } else {
                        System.out.println("Element not found in array");
                    }
                    break;
                    
                case 2:
                    try {
                        System.out.print("Enter index to update: ");
                        int update_idx = scanner.nextInt();
                        System.out.print("Enter new value: ");
                        int desired_num = scanner.nextInt();
                    
                        int[] result = sequence.Number_Modifier(update_idx, desired_num);
                        System.out.println("Old value: " + result[0]);
                        System.out.println("New value: " + result[1]);
                    } catch (Exception e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;
                    
                case 3:
                    try {
                        System.out.print("Enter integer to add: ");
                        int added_num = scanner.nextInt();
                    
                        sequence.Number_End_Add(added_num);
                        System.out.println("Successfully added " + added_num);
                    } catch (Exception e) {
                        System.out.println("Error adding integer: " + e.getMessage());
                    }
                    break;
                    
                case 4:
                    try {
                        System.out.print("Enter index to remove: ");
                        int remove_idx = scanner.nextInt();
                    
                        int removed_value = sequence.Number_Remove(remove_idx);
                        System.out.println("Successfully removed value: " + removed_value);
                    } catch (Exception e) {
                        System.out.println("Error removing integer: " + e.getMessage());
                    }
                    break;
                
                case 5:
                    sequence.display();
                    break;
                    
                case 0:
                    running = false;
                    System.out.println("Exiting application...");
                    break;
                    
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
        scanner.close();
    }
    
    public static void displayMenu() {
        System.out.println("\n=== Array Operations Menu ===");
        System.out.println("1. Check for element (return index)");
        System.out.println("2. Modify value at index");
        System.out.println("3. Add integer to end");
        System.out.println("4. Remove integer at index");
        System.out.println("5. Display array");
        System.out.println("0. Exit");
        System.out.print("Enter choice: ");
    }
}