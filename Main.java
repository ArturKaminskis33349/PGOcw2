public class Main{
    public static void main(String[] args) {
        int[] arr1 = new int[] {1,2,3,4,5,6};
        int[] arr2 = filterEvenIndexOddValue(arr1);
        printArray(arr2);
        int[] arr3 = new int[] {5,5,5,5,1};
        System.out.println(findDominant(arr3));
        int[] arr4 = new int[] {1,2,3,4,5};
        int[] arr5 = rotateArray(arr4, 1);
        printArray(arr5);
        }

    public static int[] rotateArray(int[] arr4, int positions) {
        int[] arr5 = new int[arr4.length];
        for(int i = 0; i < arr4.length; i++){
            while(positions > 0){
                arr5[i] = arr4[arr4.length - positions];
                positions--;
            }

        }
        return arr5;
    }

    public static int findDominant(int[] arr3) {
        int x = 0;
        for(int i = 0; i < arr3.length; i++){
            for(int j = 0; j < arr3.length; j++){
                if(arr3[i] == arr3[j]){
                    x++;
                }
            }
            if(x >= arr3.length/2){
                return arr3[i];
            }else{
                x=0;
            }
        }
        return -1;
    }

    public static int[] filterEvenIndexOddValue(int[] array) {
        int x = 0, y = 0;
        for(int i = 0; i<array.length; i++){
            if(i%2==0){
                if(array[i]%2!=0){
                    x++;
                }
            }
        }
        int[] result = new int[x];
        for(int i = 0; i<array.length; i++){
            if(i%2==0){
                if(array[i]%2!=0){
                    result[y] = array[i];
                    y++;
                }
            }
        }
        return result;
    }
    public static void printArray(int[] array){
        for(int i = 0; i<array.length; i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
}