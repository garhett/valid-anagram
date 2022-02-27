// This question is asked by Facebook. Given two strings s and t return whether or not s is an anagram of t.
// Note: An anagram is a word formed by reordering the letters of another word.

// Ex: Given the following strings...

// s = "cat", t = "tac", return true
// s = "listen", t = "silent", return true
// s = "program", t = "function", return false

class Main {

	public static boolean isValidAnagram(String s, String t) {
		
		if(s == null && t == null) 
			return true;
		if((s == null || t == null) || (s.length() != t.length())) 
			return false;
        
		int[] ct = new int[26];
        
		for(int i = 0; i < s.length(); i++) {
			ct[s.charAt(i)-'a']++;
		}
		for(int i = 0; i < t.length(); i++) {
			ct[t.charAt(i)-'a']--;
			if (ct[t.charAt(i)-'a'] < 0) 
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println("is valid anagram? " + isValidAnagram("cat", "tac")); // should be true
		System.out.println("is valid anagram? " + isValidAnagram("listen", "silent")); // should be true
		System.out.println("is valid anagram? " + isValidAnagram("program", "function")); // should be false
		System.out.println("is valid anagram? " + isValidAnagram("stations", "function")); // should be false
	}
}