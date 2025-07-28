public String oneTwo(String str) {
  String result = "";

  for (int i = 0; i <= str.length() - 3; i += 3) {
    result += str.substring(i + 1, i + 3);  
    result += str.charAt(i);               
  }

  return result;
}
