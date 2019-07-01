import java.io.*;
import java.util.*;
class Anagram {
    String anagram = "";
    Anagram(String anagram){
     this.anagram = anagram;
    }

    ArrayList<String> match(List<String> list){
        ArrayList<String> result = new ArrayList<String>();
        for (String listItem : list) { 	
            
            int[] toCheckArray = new int[26];
            int[] toCheckArray2 = new int[26];
            boolean isAnagram = true;
            boolean isIdentical = true;
            
             if( listItem.length() != this.anagram.length()){
                continue;
             }
             
            for(int i =0; i< this.anagram.length();i++){
                toCheckArray[(int)Character.toLowerCase(this.anagram.charAt(i)) - 97] = toCheckArray[(int)Character.toLowerCase(this.anagram.charAt(i)) - 97] + 1;
                if(Character.toLowerCase(listItem.charAt(i)) != Character.toLowerCase(this.anagram.charAt(i))){
                    isIdentical = false;
                }
            }
            
            if(isIdentical){
                continue;
            }

            for(int i =0; i< listItem.length();i++){
                toCheckArray2[(int)Character.toLowerCase(listItem.charAt(i)) - 97] = toCheckArray2[(int)Character.toLowerCase(listItem.charAt(i)) - 97] + 1;
            }
            
            for(int i =0; i< toCheckArray.length;i++){
               if(toCheckArray[i] != toCheckArray2[i]){
                  isAnagram = false;
               }
            }
          

            if(isAnagram){
                result.add(listItem);
                System.out.println(listItem);

            }
       }
        return result;

    }

}
