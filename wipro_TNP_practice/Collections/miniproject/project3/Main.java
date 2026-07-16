package Collections.miniproject.project3;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Card> cards = new ArrayList<>();
        HashSet<Character> symbols = new HashSet<>();

        while (symbols.size() < 4) {

            System.out.println("Enter a card :");

            char symbol = sc.next().charAt(0);
            int number = sc.nextInt();

            Card card = new Card(symbol, number);

            cards.add(card);
            symbols.add(symbol);
        }

        System.out.println("Four symbols gathered in " + cards.size() + " cards.");

        TreeMap<Character, Integer> result = new TreeMap<>();

        for (Card c : cards) {

            if (!result.containsKey(c.getSymbol())) {
                result.put(c.getSymbol(), c.getNumber());
            }
        }

        System.out.println("Cards in Set are :");

        for (Character ch : result.keySet()) {
            System.out.println(ch + " " + result.get(ch));
        }

        sc.close();
    }
}
