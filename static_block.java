public class static_block {

  public static void main(String[] args) {
    System.out.println("Main called");
    System.out.println(static_block.a);
  }

  static {
    System.out.println("Static Block Called");
  }
  static int a = 2;
}
