package classes;

public class zadanie1 {
    public static int[] filterEvenIndexOddValue(int[] arr) {
        int x = 0, y = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                if (arr[i] % 2 != 0) {
                    x++;
                }
            }
        }
        int[] result = new int[x];
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                if (arr[i] % 2 != 0) {
                    result[y] = arr[i];
                    y++;
                }
            }
        }
        return result;
    }
}
