package DataTypes_Array_String;

public class Array {
    public static void main(String_Example[] args) {
        /*
         Array is a collection of elements of the same data type
         DataType [] reference_variable = new DataType[size];
         DataType [] reference_variable = new DataType[]{elem1,elem2};
        */

        // One Dimensional Array --> Single row
        int [] arr1 = new int[5];

        arr1[0] = 100;
        arr1[1] = 200;

        int [] arr2 = new int[]{10,20,30,40,50};

        for(int i = 0;i < arr2.length;i++){
            System.out.println(arr2[i]);
        }

        /* Multidimensional Array --> Multiple rows
         2 3 4
         5 6 7
         8 9 10

         DataType [][] reference_variable = new DataType [row][column];
         DataType [][] reference_variable = new DataType [row][];
         DataType [][] reference_variable = new DataType [][]{{elem1,elem2,elem3},{elem4,elem5,elem6}};

        * */

        int [][] arr3 = new int [2][3];

        arr3[1][1] = 150;

        int [][] arr4 = new int [][]{{10,20,30},{40,50,60}};

        System.out.println(arr4.length);

        // .length in 1 dimensional array gives number of elements
        // .length in 2 dimensional array gives number of rows

        System.out.println("Printing 2 dimensional array");
        for(int i = 0;i < arr4.length;i++){
            for(int j = 0;j < arr4[i].length;j++){
                System.out.print(arr4[i][j] + " ");
            }
            System.out.println();
        }

    }
}
