public boolean prefixAgain(String str, int n) {
  
  
  String prefix = str.substring(0, n);

  for (int i = 1; i <= str.length() - n; i++) {
    if (str.substring(i, i + n).equals(prefix)) {
      return true;
    }
  }

  return false;
}
