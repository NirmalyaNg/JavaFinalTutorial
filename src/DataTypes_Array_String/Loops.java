package DataTypes_Array_String;

public class Loops {
    public static void main(String_Example[] args) {
        int [] arr = new int[]{1,2,3,4,5};
        int i = 0;

        System.out.println("While Loop");
        while(i < arr.length){
            System.out.println(arr[i]);
            i++;
        }

        System.out.println("For loop");
        for(int j = 0;j < arr.length;j++){
            // In for loop we can get access to element + index
            System.out.println(arr[j]);
        }

        System.out.println("Enhanced for loop");

        for(int x : arr){
            // In enhanced for loop we can get access to only element
            System.out.println(x);
        }

    }
}
