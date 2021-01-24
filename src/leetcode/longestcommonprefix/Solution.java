package leetcode.longestcommonprefix;

class Solution {
  public String longestCommonPrefix(String[] strs) {
    if (strs.length == 0) return "";

    int minLength = Integer.MAX_VALUE;
    for (String str : strs)
      minLength = Math.min(minLength, str.length());

    int low = 1;
    int high = minLength;

    while (low <= high) {
      int middle = (low + high) / 2;
      if (isCommonPrefix(strs, middle))
        low = middle + 1;
      else
        high = middle - 1;
    }
    return strs[0].substring(0, (low + high) / 2);
  }

  private boolean isCommonPrefix(String[] strings, int len){
    String check = strings[0].substring(0,len);
    for (int i = 1; i < strings.length; i++)
      if (!strings[i].startsWith(check)) return false;
    return true;
  }
}
