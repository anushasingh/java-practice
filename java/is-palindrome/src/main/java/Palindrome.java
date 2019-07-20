public class Palindrome {
    public boolean check(String sentence) {

        // Removing all special characters and making the sentence lowercase 
        String originalSentence = sentence.replaceAll("[^a-zA-Z]", "").toLowerCase();

        // Reversing the sentence
        StringBuilder sb = new StringBuilder(originalSentence);
        String reversedSentence = sb.reverse().toString();

        // Comparison of original and reversed
        if (originalSentence.equals(reversedSentence)) {
            return true;
        }

        return false;
    }
}
