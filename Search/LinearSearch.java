package Search;

// O(n)
public class LinearSearch {
    public static void main(String[] args) {
        
        int num[] = {4,2,7,3,6,88,34};

        int result = linearSearch(num, 3);

        if(result == -1)
            System.out.println("Element not found");
        else
            System.out.println("Element found: "+ result);

    }
    public static int linearSearch(int[] num, int target) {
        for (int val : num) {
            if (val == target){
                return val;
            }
        }
        return -1;
    }
}
