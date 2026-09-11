
class GrandParent {
  GrandParent() {
    System.out.print("GP() ");
  }

  GrandParent(String n) {
    System.out.print("GP(" + n + ") ");
  }
}

class Parent extends GrandParent {
  Parent() {
    super("p");
    System.out.print("P() ");
  }

  Parent(int x) {
    System.out.print("P(" + x + ") ");
  }
}

class Child extends Parent {
  Child() {
    super();
    System.out.print("C() ");
  }

  Child(int y) {
    super(y);
    System.out.print("C(" + y + ") ");
  }
}

public class Practice_constructor {
  public static void main(String[] args) {
    new Child();
    System.out.println();
    new Child(5);
  }
}