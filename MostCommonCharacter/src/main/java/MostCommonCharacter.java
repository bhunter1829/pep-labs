import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;


public class MostCommonCharacter {
    /**
     * Find the most common character in str.
     * You could use a HashMap that maps a Character key to an Int value to represent how many times a Character has
     * been spotted.
     * @param str A String.
     * @return the most common character within str.
     */
    public char recurringChar(String str) {
        HashMap<Character, Integer> tempHash = new HashMap<Character, Integer>();

        for(int i = 0; i < str.length(); i++){
            if(tempHash.containsKey(str.charAt(i))){
                tempHash.put(str.charAt(i), tempHash.get(str.charAt(i)) +1);
            }
            else{
                tempHash.put(str.charAt(i), 1);
            }
        }
        int maxValueInMap = (Collections.max(tempHash.values()));
 
        
        for (Entry<Character, Integer> entry : tempHash.entrySet()) {
 
            if (entry.getValue() == maxValueInMap) {
 
                
                return (entry.getKey());
            }
        }

        return 0;
    }
}
