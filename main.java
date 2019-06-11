import java.util.*;

class main {

	public static void main(String args[]){
		if(args.length != 1){
			System.out.println("Veuillez n'entrer qu'un argument");
		}
		else{
			HashMap<String, Integer> map = new HashMap<String, Integer>();	
			String text = args[0];
			map = countWords(text);

			for ( String key : map.keySet()) {
				System.out.println( key + " = " + map.get(key) );
			}
		}
	}

	public static HashMap<String, Integer> countWords(String text){
		HashMap<String, Integer> toReturn = new HashMap<String, Integer>();
		Integer count = 0;
		String[] textSplit = text.split(" ");
		
		for(String word : textSplit){
			if(!toReturn.containsKey(word)){
				toReturn.put(word,0);
			}
		}

		for(String word : textSplit){
			count = toReturn.get(word);
			count++;
			toReturn.replace(word,count);
		}

		return toReturn;
	}
}
