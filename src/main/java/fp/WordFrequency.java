package fp;

import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import Constants.StringConstants;

public class WordFrequency {
	/**
	 * 
	 * @param words - contain words.
	 * @return - frequency of each word.
	 */
	public Map<String,Integer> wordFreq(String words) {
		TreeMap<String, Integer> wordMap = new TreeMap<String, Integer>();
		Matcher m = Pattern.compile("\\w+").matcher(words);
		
		while (m.find()){
			String word = m.group().toLowerCase();
			
			if (!StringConstants.getNON_WORDS().contains(word)){
				Integer count = wordMap.get(word);
				if (count ==null){
					count = 1;
				}else {
					count = count + 1;
				}
				wordMap.put(word, count);
			}
		}
		return wordMap;
	}
}
