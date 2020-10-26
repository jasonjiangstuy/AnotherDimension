import java.util.Arrays;

public class Tester{
    public static void main(String[] args){
        
        int [] test1 = {1, 2, 3, 4, 5};
        int [] test2 = {5 , 4 , 3, 2, 1};
        
        
    // testing sum
        System.out.println(ArrayOps.sum(test1));
        System.out.println(ArrayOps.sum(test2));
        // 15

    // Largest 
        System.out.println(ArrayOps.largest(test1));
        System.out.println(ArrayOps.largest(test2));
        // 5

    int[][] A = { {  1,  0, 12, -1 },
                  {  7, -2,  2,  1 },
                  { -5, -2,  2, -9 }
               };
    int[] B = {  1, 3, 5 };

    int [][] C =
    {};

    int [][] D =
    {{}};

    // sumRows
        System.out.println( Arrays.toString(ArrayOps.sumRows(A)))   ;
        // [12, 8, -14]
    // largestInRows
        System.out.println(Arrays.toString(ArrayOps.largestInRows(A)));
        // [12, 7, 2]
    // 2d sum
    System.out.println( ArrayOps.sum(B)) ;
    // 9

    System.out.println( ArrayOps.sum(A));
    // 6

// 5

    // sum col
    System.out.println( Arrays.toString(ArrayOps.sumCols(A))) ;
    // [3, -4, 16, -9]

    System.out.println( Arrays.toString(ArrayOps.sumCols(C))) ;
    System.out.println( Arrays.toString(ArrayOps.sumCols(D))) ;
    // {}

    int [][] fivetest1 = 
    { {  1,  2, 3, 4 },
    {  2, 3,  4,  1 },
    { 3, 4,  1, 2 } };

    int [][] fivetest2 = 
    { {  1,  1, 1 },
    {  2, 2, 2 },
    { 3,  3, 3 } };

    int [][] fivetest3 =
    { {  2,  2, 2 },
    {  2, 2, 2 } };


    // isRowMagic
    System.out.println( ArrayOps.isRowMagic(fivetest1));
    // true
    System.out.println( ArrayOps.isRowMagic(fivetest2));
    // false
    System.out.println( ArrayOps.isRowMagic(fivetest3));
    // true

    // isColMagic
    System.out.println( ArrayOps.isColMagic(fivetest1));
    // false
    System.out.println( ArrayOps.isColMagic(fivetest2));
    // true
    System.out.println( ArrayOps.isColMagic(fivetest3));
    // true



    int[][]E = { 
        {  2,  4, 2 }, 
        {  2, 2, 2 } }; 

    // isLocationMagic
    System.out.println( ArrayOps.isLocationMagic(E, 0 , 1));
    // false

    System.out.println( ArrayOps.isLocationMagic(E, 1, 1));
    // true





    }
}