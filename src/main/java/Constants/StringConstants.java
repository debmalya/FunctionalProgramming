package Constants;

import java.util.HashSet;
import java.util.Set;

public class StringConstants {
	private static Set<String> NON_WORDS = new HashSet<String>() {
		/**
		 * 
		 */
		private static final long serialVersionUID = 5530478280883907483L;

		{
			add("the");
			add("and");
			add("of");
			add("to");
			add("a");
			add("i");
			add("it");
			add("in");
			add("or");
			add("is");
			add("a");
			add("it");
			add("in");
			add("or");
			add("is");
			add("d");
			add("s");
			add("so");
			add("but");
			add("be");
			add("at");
		}
	};

	/**
	 * @return the nON_WORDS
	 */
	public static Set<String> getNON_WORDS() {
		return NON_WORDS;
	}

	
}
