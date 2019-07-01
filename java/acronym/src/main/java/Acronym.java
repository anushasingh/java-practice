class Acronym {
    String phrase = "";
    Acronym(String phrase) {
        this.phrase = phrase;
    }
    String get() {
        String acronym = "";
        for(int i =0; i< phrase.length();i++){
            if(i ==0){
                acronym += Character.toUpperCase(phrase.charAt(0));
            } 
            else if(phrase.charAt(i) == ' ' || phrase.charAt(i) == '_' || phrase.charAt(i) == '-' ) {
                if(phrase.charAt(i+1) != ' ' && phrase.charAt(i+1) != '_' && phrase.charAt(i+1) != '-'){
                acronym += Character.toUpperCase(phrase.charAt(i+1));
                }
            }
        }
        return acronym;
    }
}
