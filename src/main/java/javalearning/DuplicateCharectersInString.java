package javalearning;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateCharectersInString {
	

	

	public static void main(String[] args) {

		String name = "jalakrishna";
		Map<Character, Integer> charmap = new HashMap<>();
		char[] namechar = name.toCharArray();  
		for(Character ch : namechar) {
			
			if(charmap.containsKey(ch)) {
				charmap.put(ch, charmap.get(ch)+1);
			}else {
				charmap.put(ch, 1);
			}
		}
		
		Set<Character> keys = charmap.keySet();
		Set<Entry<Character, Integer>> entryset = charmap.entrySet();
		for(Character ch : keys) {
			if(ch > 1 ) {
				System.out.println(ch + "---" +charmap.get(ch));
			}
		}
		
		for( Entry<Character, Integer> es : entryset ) {
			
			if(es.getValue() >1 ) {
				System.out.println(es + "---" +es.getValue());
				
			}
		}
	
		
	}
	
	

	
	

}
