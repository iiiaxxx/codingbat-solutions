public boolean love6(int a, int b) {
  int sum = a + b;
  int diff = Math.abs(a - b);
  if (a == 6 || b == 6 || sum == 6 || diff == 6) {
    return true;
  }
  return false;
  
}
