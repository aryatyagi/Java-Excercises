import java.util.ArrayList;

public class Variance {
    // Copy here sum from exercise 63 
    public static int sum(ArrayList<Integer> list) {
        int a = list.size() - 1;
        int sum = 0;
        while(!(a ==  -1)){
            sum = sum + list.get(a);
            a = a - 1;
        }
        return sum;
    }
    
    // Copy here average from exercise 64 
    public static double average(ArrayList<Integer> list) {
        double d = list.size();
        double average = sum(list)/d;
        return average;
    }

    public static double variance(ArrayList<Integer> list) {
        
        return 0;
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);
        
        System.out.println("The variance is: " + variance(list));
    }

}
