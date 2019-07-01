class RnaTranscription {

    String transcribe(String dnaStrand) {

        StringBuilder sb = new StringBuilder("");

        for(int j =0; j<dnaStrand.length();j++){
        
            if(dnaStrand.charAt(j) == 'A'){
                sb.append("U");
            }  else if(dnaStrand.charAt(j) == 'T'){
                sb.append("A");
            }else if(dnaStrand.charAt(j) == 'C'){
                sb.append("G");
            }else if(dnaStrand.charAt(j) == 'G'){
                sb.append("C");
            } else {
                break;
            }
         }
                return  sb.toString();
            
    }

}