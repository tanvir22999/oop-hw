public class nasted_class {
  private int a = 3;
  static int b = 6;

  class Inner {
    {
      System.out.println(b);
    }
  }

  public static void main(String[] args) {
    nasted_class a = new nasted_class();
    nasted_class.Inner b = a.new Inner();
  }
}
