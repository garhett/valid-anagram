// This question is asked by Facebook. Given two strings s and t return whether or not s is an anagram of t.
// Note: An anagram is a word formed by reordering the letters of another word.

// Ex: Given the following strings...

// s = "cat", t = "tac", return true
// s = "listen", t = "silent", return true
// s = "program", t = "function", return false

class Main {
  
  public static boolean isValidAnagram(String s, String t) {
    // todo finish the log to test valid anagram here. Change return value
      return true;
    }

  public static void main(String[] args) {
    System.out.println("is valid anagram? " + isValidAnagram("cat", "tac")); // should be true
    System.out.println("is valid anagram? " + isValidAnagram("listen", "silent")); // should be true
    System.out.println("is valid anagram? " + isValidAnagram("program", "function")); // should be false
   }
}