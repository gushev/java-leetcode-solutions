package leetcode.longestcommonprefix;

class SolutionOld {
  public String longestCommonPrefix(String[] strs) {
    if (strs.length <= 0) {
      return "";
    }

    String result = "";

    for(int i = 0; i < strs[0].length(); i++) {
      char letter = strs[0].charAt(i);
      boolean diff = false;
      for (int j = 1; j < strs.length; j++) {
        if(strs[j].length() <= i || letter != strs[j].charAt(i)) {
          diff = true;
        }
      }

      if (diff) {
        break;
      } else {
        result = result + letter;
      }
    }

    return result;
  }
}
