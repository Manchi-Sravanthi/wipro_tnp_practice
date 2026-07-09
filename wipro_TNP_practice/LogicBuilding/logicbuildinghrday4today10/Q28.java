package logicbuildinghrday4today10;

public class Q28 {

    public static String secondWordUpperCase(String input1)
    {
        String[] words = input1.trim().split("\\s+");

        if(words.length < 2)
        {
            return "LESS";
        }

        return words[1].toUpperCase();
    }

    public static void main(String[] args)
    {
        System.out.println(secondWordUpperCase("Java is easy"));      // IS
        System.out.println(secondWordUpperCase("Hello World"));       // WORLD
        System.out.println(secondWordUpperCase("Welcome"));           // LESS
    }
}