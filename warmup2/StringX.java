public String stringX(String str) {
  String result = "";
  for (int i=0; i<str.length(); i++) {
     // If its not a middle(x) then keep it
    if (!(i > 0 && i < (str.length()-1) && str.substring(i, i+1).equals("x"))) {
      result = result + str.substring(i, i+1); 
    }
  }
  return result;
}
