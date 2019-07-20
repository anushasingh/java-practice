import java.util.HashMap;
import java.util.Map;

/**
 * For creating individual poem lines.
 */
class PoemLineInfo {
    private String ordinal;
    private String content;

    public PoemLineInfo(String ordinal, String content) {
        this.ordinal = ordinal;
        this.content = content;
    }

    /**
     * To get the ordinal for the poem line.
     */
    public String getOrdinal() {
        return ordinal;
    }

    /**
     * To get the main content for the poem line.
     */
    public String getcontent() {
        return content;
    }
}

class TwelveDays {

    /**
     * Constant defining the format of each poem line.
     */
    private final static String VERSE_FORMAT = "On the %s day of Christmas my true love gave to me: %s";

    final static Map<Integer, PoemLineInfo> poemLine = new HashMap<>();
    static {
        poemLine.put(1,  new PoemLineInfo("first", "a Partridge in a Pear Tree.\n"));
        poemLine.put(2,  new PoemLineInfo("second", "two Turtle Doves, and "));
        poemLine.put(3,  new PoemLineInfo("third", "three French Hens, "));
        poemLine.put(4,  new PoemLineInfo("fourth", "four Calling Birds, "));
        poemLine.put(5,  new PoemLineInfo("fifth", "five Gold Rings, "));
        poemLine.put(6,  new PoemLineInfo("sixth", "six Geese-a-Laying, "));
        poemLine.put(7,  new PoemLineInfo("seventh", "seven Swans-a-Swimming, "));
        poemLine.put(8,  new PoemLineInfo("eighth", "eight Maids-a-Milking, "));
        poemLine.put(9,  new PoemLineInfo("ninth", "nine Ladies Dancing, "));
        poemLine.put(10, new PoemLineInfo("tenth", "ten Lords-a-Leaping, "));
        poemLine.put(11, new PoemLineInfo("eleventh", "eleven Pipers Piping, "));
        poemLine.put(12, new PoemLineInfo("twelfth", "twelve Drummers Drumming, "));
    }

    /**
     * Generates verse accroding to verse number.
     * @param verseNumber
     * @return
     */
    String verse(int verseNumber) {
        PoemLineInfo PoemLineInfo = poemLine.get(verseNumber);
        String newString = String.format(VERSE_FORMAT, PoemLineInfo.getOrdinal(), PoemLineInfo.getcontent());
        for (int i = verseNumber - 1; i >= 1; i--) {
            newString += poemLine.get(i).getcontent();
        }
        return newString;
    }

    /**
     * Generates all verses from given start index to end index.
     * @param startVerse
     * @param endVerse
     */
    String verses(int startVerse, int endVerse) {
        String finalText = "";
        for (int i = startVerse; i <= endVerse; i++) {
            finalText += verse(i);
            if (i != endVerse) { finalText += "\n"; }
        }
        return finalText;
    }

    /**
     * Returns the entire lyrics of poem.
     * @return
     */
    String sing() {
        return verses(1, 12);
    }
}