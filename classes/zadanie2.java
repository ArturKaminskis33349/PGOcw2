package classes;

public class zadanie2 {
    public static int findDominant(int[] arr) {
        int x = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    x++;
                }
            }
            if (x >= arr.length / 2) {
                return arr[i];
            } else {
                x = 0;
            }
        }
        return -1;
    }
}
