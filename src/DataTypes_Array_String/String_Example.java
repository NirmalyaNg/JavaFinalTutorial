package DataTypes_Array_String;

public class String_Example {
    public static void main(String[] args) {
        /*
        * The basic difference is that primitive variables store the actual values,
        * whereas reference variables store the addresses of the objects they refer to
        * */

        // !!!!---String is an immutable object---!!!!

        String str1 = "hello"; // String object created in String pool
        String str2 = "hello";  // str1 and str2 points to same object in string pool

        String str3 = new String("hello");  // String object created outside string poll

        System.out.println(str1 == str2); // true
        System.out.println(str1 == str3); // false

        System.out.println(str1.equals(str3)); // true because it compares the values and not addresses

    }
}
