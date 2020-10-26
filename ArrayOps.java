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

    
    // part 5

    // 5a
    public static int[] sumCols(int[][] matrix){
        if (!(matrix.length > 0)){
            return new int[0];
        }
        int[] myFinal = new int[matrix[0].length];
        for(int x = 0; x < matrix[0].length; x++){
            int sum = 0;
            for (int i = 0; i < matrix.length; i++){
                sum += matrix[i][x];
            }
            myFinal[x] = sum;
        }
        return myFinal;

    }

    // 5b
    public static boolean isRowMagic(int[][] matrix){

        int [] arr = sumRows(matrix);
        if (arr.length <= 0) {
            return true;
        }
        int hold = arr[0];

        for (int i = 0; i < arr.length ; i++){
            if (hold != arr[i]){
                return false;
            }
        }
        return true;

    }
    public static boolean isColMagic(int[][] matrix) {}
    public static boolean isLocationMagic(int[][] matrix, int row, int col){}
}
