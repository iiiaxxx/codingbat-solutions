public boolean xyBalance(String str) {
  boolean yFound = false;

  for (int i = str.length() - 1; i >= 0; i--) {
    if (str.charAt(i) == 'y') {
      yFound = true;  
    }

    if (str.charAt(i) == 'x') {
      if (!yFound) {
        return false;  
      }
    }
  }

  return true;
}
