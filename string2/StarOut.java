public String starOut(String str) {
  StringBuilder result = new StringBuilder();

  for (int i = 0; i < str.length(); i++) {
    boolean isStar = str.charAt(i) == '*';
    boolean leftStar = i > 0 && str.charAt(i - 1) == '*';
    boolean rightStar = i < str.length() - 1 && str.charAt(i + 1) == '*';

    if (!isStar && !leftStar && !rightStar) {
      result.append(str.charAt(i));
    }
  }

  return result.toString();
}
