public String sameEnds(String str) {
  int len = str.length();
  String result = "";

  for (int i = 0; i < len / 2; i++) {
    String start = str.substring(0, i + 1);
    
    
    String end = str.substring(len - i - 1);
    if (start.equals(end)) {
      result = start;
      
    }
  }

  return result;
}
