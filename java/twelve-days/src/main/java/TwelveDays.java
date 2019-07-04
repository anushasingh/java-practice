import java.util.*;

class TwelveDays {
    private HashMap<Integer, String> cardinal_numbers;
    private HashMap<Integer, String> ordinal_numbers;
    private List<String> gifts;

    TwelveDays() {
        cardinal_numbers = new HashMap<>();
        cardinal_numbers.put(1, "a");
        cardinal_numbers.put(2, "two");
        cardinal_numbers.put(3, "three");
        cardinal_numbers.put(4, "four");
        cardinal_numbers.put(5, "five");
        cardinal_numbers.put(6, "six");
        cardinal_numbers.put(7, "seven");
        cardinal_numbers.put(8, "eight");
        cardinal_numbers.put(9, "nine");
        cardinal_numbers.put(10, "ten");
        cardinal_numbers.put(11, "eleven");
        cardinal_numbers.put(12, "twelve");

        ordinal_numbers = new HashMap<>();
        ordinal_numbers.put(1, "first");
        ordinal_numbers.put(2, "second");
        ordinal_numbers.put(3, "third");
        ordinal_numbers.put(4, "fourth");
        ordinal_numbers.put(5, "fifth");
        ordinal_numbers.put(6, "sixth");
        ordinal_numbers.put(7, "seventh");
        ordinal_numbers.put(8, "eighth");
        ordinal_numbers.put(9, "ninth");
        ordinal_numbers.put(10, "tenth");
        ordinal_numbers.put(11, "eleventh");
        ordinal_numbers.put(12, "twelfth");

        gifts = new ArrayList<>();
        gifts.add("Partridge in a Pear Tree");
        gifts.add("Turtle Doves");
        gifts.add("French Hens");
        gifts.add("Calling Birds");
        gifts.add("Gold Rings");
        gifts.add("Geese-a-Laying");
        gifts.add("Swans-a-Swimming");
        gifts.add("Maids-a-Milking");
        gifts.add("Ladies Dancing");
        gifts.add("Lords-a-Leaping");
        gifts.add("Pipers Piping");
        gifts.add("Drummers Drumming");
    }

    String getGifts(int verseNumber) {
        StringBuilder sb = new StringBuilder();

        for (int v = verseNumber; v > 0; v--) {
            if (v > 1 || verseNumber == 1) {
                sb.append(String.format("%s %s", cardinal_numbers.get(v), gifts.get(v - 1)));
                if (verseNumber != 1) {
                    sb.append(", ");
                }
            } else {
                sb.append("and " + String.format("%s %s", cardinal_numbers.get(v), gifts.get(v - 1)));
            }
        }

        return sb.toString();
    }

    String verse(int verseNumber) {
        return String.format("On the %s day of Christmas my true love gave to me: %s.\n",
                ordinal_numbers.get(verseNumber), getGifts(verseNumber));
    }

    String verses(int startVerse, int endVerse) {
        StringBuilder sb = new StringBuilder();

        for (int i = startVerse; i <= endVerse; i++) {
            sb.append(String.format("%s", verse(i)));
            if (i != endVerse) {
                sb.append("\n");
            }
        }

        return sb.toString();
    }

    String sing() {
        return verses(1, 12);
    }
}