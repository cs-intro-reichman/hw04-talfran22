public class ArrayOps {
    public static void main(String[] args) {
        int[] array = {2,8,3,7,8};
        int[] array2 = {0,1,2,3,4};
        System.out.println((findMissingInt(array)));
        System.out.println(secondMaxValue(array));
        System.out.println(containsTheSameElements(array, array2));
        System.out.println(isSorted(array));
    }
    
    public static int findMissingInt (int [] array) {
        for(int i = 0 ; i < array.length ; i++)
        {
            // #feedback: it's not common to compare boolean variables - just use it value as needed
            if(!isInArray(array, i))
                return i;

        }
        return array.length;
    }

    public static int secondMaxValue(int [] array) {
        // #feedback: use camelCase for variable names
        int[] noBig = new int[array.length - 1];
        int max = array[0];
        int j = 0;
        for(int i = 1; i < array.length; i++){
            // #feedback: simply use if-else
            if(array[i] <= max){
                noBig[j] = array[i];
            } else {
                noBig[j] = max;
                max = array[i];
            }
            // #feedback: j++ happen for both cases
            j++;
        }
        max = noBig[0];
        // #feedback: you could use here i again
        for(int k = 1; k < noBig.length ; k++){
            if(noBig[k] > max)
                max = noBig[k];
        }
        return max;
    }

    public static boolean containsTheSameElements(int [] array1,int [] array2) {
        for(int i = 0; i < array1.length ; i++){
            // #feedback: it's not common to compare boolean variables - just use it value as needed
            if(!isInArray(array2, array1[i]))
                return false;
        }
        return true;
    }

    public static boolean isSorted(int [] array) {
        /*
            #feedback:
            Assume array = {5, 5, 3, 2, 7}
            Your code will return true regardless what happen after the second index.
            You didn't cover cases when first values are equal where it should be expected in both increasing\decreasing arrays.
        */
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
        return false;
    }

    public static void println(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

}
