import classes.*;

public class Main {
    public static void main(String[] args) {
        int[] arr1 = new int[]{1, 2, 3, 4, 5, 6};
        printArray(zadanie1.filterEvenIndexOddValue(arr1));
        int[] arr2 = new int[]{5, 5, 5, 5, 1};
        System.out.println(zadanie2.findDominant(arr2));
        int[] arr3 = new int[]{1, 2, 3, 4, 5};
        printArray(zadanie3.rotateArray(arr3, 2));
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}