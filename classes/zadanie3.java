package classes;

public class zadanie3 {

    public static int[] rotateArray(int[] arr, int positions) {
        int[] result = new int[arr.length];
        int n = 0;
        for (int i = 0; i < arr.length; i++) {
            if (positions > 0) {
                result[i] = arr[arr.length - positions];
                positions--;
            } else {
                result[i] = arr[n];
                n++;
            }
        }
        return result;
    }
}
