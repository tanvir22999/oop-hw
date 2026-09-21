class Mypoint {
  private int x = 0;
  private int y = 0;

  Mypoint(int x, int y) {
    this.x = x;
    this.y = y;
  }

  void setx(int x) {
    this.x = x;
  }

  void sety(int y) {
    this.y = y;
  }

  void stexy(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public String toString() {
    return "(" + x + "," + y + ")";
  }
}

class MyTrinagle {
  private Mypoint v1;
  private Mypoint v2;
  private Mypoint v3;

  public MyTrinagle(int x1, int y1, int x2, int y2, int x3, int y3) {
    v1.stexy(x1, y1);
    v2.stexy(x2, y2);
    v3.stexy(x3, y3);
  }

  public MyTrinagle(Mypoint v1, Mypoint v2, Mypoint v3) {
    this.v1 = v1;
    this.v2 = v2;
    this.v3 = v3;
  }

  public String toString() {

    return "Triangle @ " + "v1=" + v1.toString() + "," + "v2=" + v2.toString() + "," + "v2=" + v2.toString();
  }
}

public class Practice {
  public static void main(String[] args) {
    Mypoint p1 = new Mypoint(2, 3);
    Mypoint p2 = new Mypoint(4, 5);
    Mypoint p3 = new Mypoint(10, 34);
    MyTrinagle t1 = new MyTrinagle(p1, p2, p3);
    System.out.println(t1.toString());
  }
}