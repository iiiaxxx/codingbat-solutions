public boolean in3050(int a, int b) {
  if (a >= 30 && a <= 40 && b >= 30 && b <= 40 || a >= 40 && a <= 50 && b >= 40 && b <= 50) {
    return true;
  }
 

  return false;
  // This could be written as one very large expression,
  // connecting the two main parts with ||
}