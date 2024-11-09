package Search;

// O(log n)
public class BinarySearch {
    public static void main(String[] args) {

        int num[] = { 23, 34, 45, 56, 67, 78 };

        int result = binarySearch(num, 56);
        int resultRecc = binarySearchRecursion(num, 56, 0, num.length - 1);

        if (result == -1)
            System.out.println("Element not found");
        else
            System.out.println("Element found: " + result);

        if (resultRecc == -1)
            System.out.println("Element not found");
        else
            System.out.println("Element found: " + resultRecc);
    }

    public static int binarySearch(int[] num, int target) {
        int first = 0;
        int last = num.length - 1;

        while (last >= first) {
            int mid = (first + last) / 2;
            if (num[mid] == target) {
                return num[mid];
            }
            if (num[mid] > target)
                last = mid - 1;
            else
                first = mid + 1;
        }
        return -1;
    }

    public static int binarySearchRecursion(int[] num, int target, int first, int last) {
        if (first <= last) {
            int mid = (first + (last)) / 2;
            if (num[mid] == target)
                return num[mid];
            if (num[mid] > target)
                return binarySearchRecursion(num, target, first, mid - 1);
            return binarySearchRecursion(num, target, mid + 1, last);

        }
        return -1;
    }

}
