public class Outside_varible_effect {
  // int a = 9; Outside_varible_effect.java:5: error: non-static variable a cannot
  // be referenced from a static context
  static int a = 9;

  public static void main(String[] args) {
    System.out.println(a);
  }
}
