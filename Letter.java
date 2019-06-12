
import java.util.*;

class Letter {

	public static void main(String args[]){

		HashMap<String, Integer> dictionary = new HashMap<>();
        dictionary.put("hello", 1);
        List<String> letter = Arrays.asList("hello", "there");
        boolean doOrNot = canWriteLetter(letter, dictionary);
        System.out.println(doOrNot);
	}

    public static boolean canWriteLetter(List<String> letters, HashMap<String, Integer> dictionnary){
        Integer nbrOfWords = 0;
        for(String letter : letters){
            if(!dictionnary.containsKey(letter)){
                return false;
            }
            nbrOfWords = dictionnary.get(letter);
            nbrOfWords--;
            if(nbrOfWords < 0){
                return false;
            }
        }
        return true;
    }
}
