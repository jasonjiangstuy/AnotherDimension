public class ArrayOps {


    // 4a
    public static int sum(int[] arr){
        int myFinal = 0;
        for (int i =0 ; i < arr.length; i++){
            myFinal += arr[i];
        }
        return myFinal;
    }

    // 4b
    public static int largest(int[]arr){
        int largest = Integer.MIN_VALUE;
        for (int i =0 ; i < arr.length; i++){
            if (arr[i] > largest){
                largest = arr[i];
            }
        }
        return largest;


    }

}
