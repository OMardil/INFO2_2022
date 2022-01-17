public class Arrays{

    public static void main(String[] args) {

        int[] arr1;
        arr1 = new int[10];

        int arr2[];
        arr2 = new int[10];

        int[] arr3 = new int[10];
        
        int arr4[] = new int[10];

        int[] arr5 = {0,0,0,0,0,0,0,0,0,0};

        int a = 0;
        int[] arr6 = new int[]{a, a, a, a, a, a, a, a, a, a};


        for (int i=0; i<arr1.length; i++){
            System.out.println("Count: " + arr1[i]);
        }


        int[][] x1 = new int[3][3];
        int x2[][] = new int[3][3];

        //Implicit declaration
        int[][] x3 = {{1,2,3},{4,5,6},{7,8,9}};
        printArray(x3);


        int[][] table = new int [10][6];

        int[][] b;
        b = new int[3][];
        b[0] = new int[5]; //First row, 5 elements
        b[1] = new int[7]; //Second row, 7 elements
        b[2] = new int[4]; //Third row, 4 elements

        int[][] c = {{0,0,0,0,0},     //First row, 5 elements
                     {0,0,0,0,0,0,0}, //Second row, 7 elements
                     {0,0,0,0}};      //Third row, 4 elements


        // int[][] x4 = new int[3][];
        // x4[0] = new int[3];
        // x4[1] = new int[3];
        // x4[2] = new int[3];


        // int[][] matrix = new int[3][3];
        // int contador = 1;

        // for(int row = 0; row < matrix.length; row++){
        //     for(int column = 0; column < matrix[row].length; column++){
        //         matrix[row][column] = contador++;
        //     }
        // }
    }

    public static void printArray(int[][] matrix){
        for(int row = 0; row < matrix.length; row++){
            for(int col = 0; col<matrix[row].length; col++){
                System.out.print(matrix[row][col]);
                System.out.print("\t");
            }
            System.out.println();
        }
    }

}