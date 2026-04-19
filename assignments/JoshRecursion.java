package assignments;
import java.util.Scanner;
import java.util.ArrayList;

public class JoshRecursion {
    ArrayList<Integer> rawArrayList;
    
    public JoshRecursion(){
        this.rawArrayList = new ArrayList<Integer>();
    }

    public int returnLast(Integer target){
        return returnLast(target, rawArrayList.size()-1);
    }

    private int returnLast(Integer target, int index){
        if (index<0) {
            return -1;
        }
        if(rawArrayList.get(index).equals(target)){
            return index;
        } 
            return returnLast(target, index-1);
        }
    
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a value to search the mystery array, for last occurence: ");
        Integer target = sc.nextInt();
        JoshRecursion mysteryArray = new JoshRecursion();
        
        mysteryArray.rawArrayList.addFirst(11);
        mysteryArray.rawArrayList.add(9);
        mysteryArray.rawArrayList.add(7);
        mysteryArray.rawArrayList.add(5);
        mysteryArray.rawArrayList.add(3);
        mysteryArray.rawArrayList.add(1);
        Integer mysteryIndex = mysteryArray.returnLast(target);
        if (mysteryIndex!=-1){
            System.out.println("the value is in the mystery array at index: " + mysteryIndex);
        }
        else {
            System.out.print("The value is not in the mystery array.");
        }
        
    }
}
    
