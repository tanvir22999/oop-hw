
class execution {
  execution() {
    System.out.println("Constructor called");
  }

  {
    System.out.println(" instance initializer block execution");
  }
  static {
    System.out.println(" Static instance initializer block");
  }

}

public class Block_execution {
  public static void main(String[] args) {
    execution first = new execution(); // 1. static block -> 2. Normal block -> 3. constructor call

  }
}
