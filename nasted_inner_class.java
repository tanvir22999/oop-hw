public class nasted_inner_class {
  class Inner {
    int a = 6;
  }

  Inner inner = new Inner();

  {
    System.out.println(inner.a);
  }

  public static void main(String[] args) {
    nasted_inner_class outer = new nasted_inner_class();
  }
}
