package Search;

public class BinarySearch {
    public static void main(String[] args) {

        int num[] = { 23, 34, 45, 56, 67, 78 };

        int result = binarySearch(num, 454);

        if (result == -1)
            System.out.println("Element not found");
        else
            System.out.println("Element found: " + result);
    }

    public static int binarySearch(int[] num, int target) {
        int first = 0;
        int last = num.length -1;

        while(last >= first) {
            int mid = (first+last)/2;
            if (num[mid] == target)
                return num[mid];
            if (num[mid] > target)
                last = mid - 1;
            else
                first = mid + 1;
        }
        return -1;
    }
}
