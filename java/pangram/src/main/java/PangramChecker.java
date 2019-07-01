public class PangramChecker {

    public boolean isPangram(String input) {
        boolean[] check = new boolean[26];

        for (int i = 0; i < input.length(); i++) {
            if ((int) Character.toLowerCase(input.charAt(i)) > 96
                    && (int) Character.toLowerCase(input.charAt(i)) < 123) {
                check[(int) Character.toLowerCase(input.charAt(i)) - 97] = true;
            }
        }

        for (int i = 0; i < check.length; i++) {
            if (!check[i]) {
                return false;
            }
        }
        return true;
    }

}
