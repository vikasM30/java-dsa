package Sorting;

// O(n^2)
public class BubbleSort {

    public static void main(String[] args) {
        
        int num[] = {43,53,2,11,1,45,34,2};

        System.out.println("Before Sorting: ");
        System.out.println("Size: " + num.length);
        for (int i : num) {
            System.out.print(i + " ");
        }
        System.out.println();
        bubbleSort(num, 0, 0);
        System.out.println();
        System.out.println();
        System.out.println("After Sorting: ");
        System.out.println("Size: " + num.length);
        for (int j : num) {
            System.out.print(j + " ");
        }
    }

    public static void bubbleSort(int[] num, int innerCount, int outerCount) {
        for (int i = 0; i < num.length; i++) {
            outerCount++;
            for (int j = 0; j < num.length - i - 1; j++) {
                innerCount++;
                if(num[j]>num[j+1]){
                    int k = num[j];
                    num[j] = num[j+1];
                    num[j+1] = k;
                    System.out.println();
                    // System.out.println("Iteration "+ j);
                    for (int m : num) {
                        System.out.print(m + " ");
                    }
                }
            }
        }
        System.out.println();
        System.out.println();
        System.out.println("outer count: " + outerCount);
        System.out.println("inner count: " + innerCount);
    };
}