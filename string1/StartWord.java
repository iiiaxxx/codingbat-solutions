public String startWord(String str, String word) {
  
  
  if (str.length() >= word.length()) {
    String strPart = str.substring(1, word.length());
    String wordPart = word.substring(1);

    if (strPart.equals(wordPart)) {
      return str.substring(0, word.length());
    }
  }

  return "";
}
