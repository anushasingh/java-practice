class IsogramChecker {

    boolean isIsogram(String phrase) {
        boolean[] checkSingle = new boolean[26];
        for (int i = 0; i < phrase.length(); i++) {
            char charToCheck = Character.toLowerCase(phrase.charAt(i));
            if ((int) charToCheck != 45 && (int) charToCheck != 47 && (int) charToCheck != 32) {

                if (checkSingle[(int) charToCheck - 97]) {
                    return false;
                } else {
                    checkSingle[(int) charToCheck - 97] = true;
                }
            }
        }
        return true;
    }

}
