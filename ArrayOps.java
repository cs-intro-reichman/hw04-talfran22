public class ArrayOps {
    public static void main(String[] args) {
        int[] array = {2, 3, 1, 4, 0, 4, 4, 4, 4};
        int[] array2 = {0,1,2,3,4};
        System.out.println((findMissingInt(array)));
        System.out.println(secondMaxValue(array));
        System.out.println(containsTheSameElements(array, array2));
        System.out.println(isSorted(array));
    }
    
    public static int findMissingInt (int [] array) {
        for(int i = 0 ; i < array.length ; i++)
        {
            if(isInArray(array, i) == false)
                return i;

        }
        return array.length;
    }

    public static int secondMaxValue(int [] array) {
        int[] nobig = new int[array.length - 1];
        int max = array[0];
        int j = 0;
        for(int i = 1; i < array.length; i++){
            if(array[i] < max){
                nobig[j] = array[i];
                j++;
            }
            if(array[i] > max){
                nobig[j] = max;
                max = array[i];
                j++;
            }
        }
        max = nobig[0];
        for(int k = 1; k < nobig.length ; k++){
            if(nobig[k] > max)
                max = nobig[k];
        }
        return max;
    }

    public static boolean containsTheSameElements(int [] array1,int [] array2) {
        for(int i = 0; i < array1.length ; i++){
            if(isInArray(array2, array1[i]) == false)
                return false;
        }
        return true;
    }

    public static boolean isSorted(int [] array) {
        if(array[0] > array[1]){
            for(int i = 1; i < array.length - 1; i++){
                if(array[i] < array[i + 1]){
                    return false;
                }
            }
        }
        if(array[0] < array[1]){
            for(int i = 1; i < array.length - 1; i++){
                if(array[i] > array[i + 1]){
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean isInArray(int [] array, int num) {
        for(int i = 0; i < array.length ; i++){
            if(num == array[i]){
                return true;
            }
        }
        return true;
    }

    public static void println(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

}
