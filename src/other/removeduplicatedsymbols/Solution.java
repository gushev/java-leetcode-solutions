package other.removeduplicatedsymbols;

import java.util.HashSet;
import java.util.Set;

public class Solution {

  public static String removeDuplicates(String input) {
    Set<Character> letterMap = new HashSet<>();
    String result = "";

    for(int i = 0; i < input.length(); i++) {
      char currentChar = input.charAt(i);
      if (!letterMap.contains(currentChar)) {
        result += currentChar;
        letterMap.add(currentChar);
      }
    }

    return result;
  }

  public static String removeDuplicatesSet(String input) {
    if (input.length() == 0) {
      return "";
    }

    Set<Character> letterSet = new HashSet<>();

    for(int i = 0; i < input.length(); i++) {
      letterSet.add(input.charAt(i));
    }

    return String.valueOf(letterSet);
  }
}
