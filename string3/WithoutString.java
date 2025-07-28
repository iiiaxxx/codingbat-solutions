public String withoutString(String base, String remove) {
  String result = "";
  int i = 0;

  String baseLower = base.toLowerCase();
  String removeLower = remove.toLowerCase();
  int removeLength = remove.length();

  while (i < base.length()) {
    if (i <= base.length() - removeLength) {
      String part = baseLower.substring(i, i + removeLength);
      if (part.equals(removeLower)) {
        i = i + removeLength;
        continue;
      }
    }
    result = result + base.charAt(i);
    i++;
  }

  return result;
}
