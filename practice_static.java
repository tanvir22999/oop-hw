public class practice_static {
  static int a = 2;

  // int a = 2 error genarated because non-static instance varible has a multiple
  // object java does'n know what object varible is a so its compilation error
  public static void main(String[] args) {
    System.out.println(a);
  }
}
