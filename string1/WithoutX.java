public String withoutX(String str) {
  if (str.length() > 0 && str.charAt(0) == 'x') {
    str = str.substring(1); // remove first 'x'
  }

  if (str.length() > 0 && str.charAt(str.length() - 1) == 'x') {
    str = str.substring(0, str.length() - 1); // remove last 'x'
  }

  return str;
}
