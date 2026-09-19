public class VarArgs {
  static void Test(int... a) {
    System.out.print("lenght of VarArgs: " + a.length);
    System.out.print(" Number of element:");
    for (int i : a) {
      System.out.print("  " + i);
    }
  }

  public static void main(String[] args) {
    VarArgs.Test(3, 384, 8435);
    System.out.println();
    VarArgs.Test(3);
    System.out.println();
    VarArgs.Test(9, 3, 5, 5, 5, 6, 3);
  }
}