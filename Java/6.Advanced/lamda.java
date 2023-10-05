public PerformOperation isOdd() { return a -> a % 2 != 0; }

public PerformOperation isPrime() {
  return a -> {
    if (a <= 1)
      return false;
    if (a == 2)
      return true;
    if (a % 2 == 0)
      return false;
    for (int i = 3; i < Math.sqrt(a); i++) {
      if (a % i == 0)
        return false;
    }
    return true;
  };
}

public PerformOperation isPalindrome() {
  return a -> {
    String str = String.valueOf(a);
    String reversedStr = new StringBuilder(str).reverse().toString();
    return str.equals(reversedStr);
  };
}
}
