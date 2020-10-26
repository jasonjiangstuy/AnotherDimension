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

    // 4c
    public static int[] sumRows(int[][]matrix){
        int[] myFinal = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++){
            myFinal[i] = sum(matrix[i]);
        }
        return myFinal;
    }

    // 4d
    public static int[] largestInRows(int[][] matrix){
        int[] myFinal = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++){
            myFinal[i] = largest(matrix[i]);
        }
        return myFinal;
    }

    // 4e
    public static int sum(int[][] arr) {
        int[] myFinal = sumRows(arr);
        return sum(myFinal);
    }


    public static int[] sumCols(int[][] matrix){}
    public static boolean isRowMagic(int[][] matrix){}
    public static boolean isColMagic(int[][] matrix) {}
    public static boolean isLocationMagic(int[][] matrix, int row, int col){}
}
