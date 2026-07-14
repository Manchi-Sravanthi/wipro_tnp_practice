package Collections.lambda;



interface WordCount {

    int count(String str);

}

public class Q4 {

    public static void main(String[] args) {

        WordCount wc = (str) -> {

            if (str == null || str.trim().isEmpty()) {
                return 0;
            }

            return str.trim().split("\\s+").length;
        };

        String s = "Java is a Programming Language";

        System.out.println("String : " + s);
        System.out.println("Word Count : " + wc.count(s));
    }
}
