public String minCat(String a, String b) {
  int len = Math.min(a.length(), b.length());

  String aTrimmed = a.substring(a.length() - len);
  String bTrimmed = b.substring(b.length() - len);

  return aTrimmed + bTrimmed;
}
