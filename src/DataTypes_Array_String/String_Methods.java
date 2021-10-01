package DataTypes_Array_String;

public class String_Methods {
    public static void main(String[] args) {
        String name1 = "Nirmalya";

        // Since string is immutable object new object is created when we call uppercase method
        System.out.println(name1);

        // Uppercase
        String name1Uppercase = name1.toUpperCase();
        System.out.println(name1Uppercase);

        // Lowercase
        String name1Lowercase = name1.toLowerCase();
        System.out.println(name1Lowercase);

        // Replace
        String sentence = "I am a fat fat boy";
        String replacedSentence = sentence.replace("fat","slim");
        System.out.println(replacedSentence);

        // Replace First
        String replacedSentence2 = sentence.replaceFirst("fat","slim");
        System.out.println(replacedSentence2);

        // length
        int name1Length = name1.length();
        System.out.println(name1Length);

        // Equals
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = new String("Hello");
        String s4 = new String("Hello");

        System.out.println(s1.equals(s3));
        System.out.println(s3.equals(s4));

        // EqualsIgnoreCase
        String s5 = "HELLO";
        System.out.println(s1.equalsIgnoreCase(s4));

        // Split
        String line = "1 Nirmalya Ganguly abc@gmail.com";
        String [] data = line.split(" ");
        int id = Integer.parseInt(data[0]);

        // StarsWith
        System.out.println(name1.startsWith("Ni"));

        // EndsWith
        System.out.println(name1.endsWith("lyA"));

        // charAt
        String myName = "Tubu";
        char firstChar = myName.charAt(0);
        int lastChar = myName.charAt(myName.length()-1);
        System.out.println(firstChar);
        System.out.println(lastChar);

        // Substring


        // contains

        // concat


        // indexOf


        // toCharArray


        // compareTo
    }
}
