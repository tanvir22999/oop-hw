/*
Create	a	class	"Shape"	with	abstract	methods	for	calculating	area	and	perimeter,	and	subclasses
"Rectangle",	"Circle",	and	"Triangle".
 */

abstract class Shap {
  public abstract double getArea();

  public abstract double getPerimeter();
}

class Rectangle extends Shap {
  private double width;
  private double hight;

  public Rectangle(double width, double hight) {
    this.width = width;
    this.hight = hight;
  }

  public double getArea() {
    return width * hight;
  }

  public double getPerimeter() {
    return 2 * (width + hight);
  }
}

class Circle extends Shap {
  private double radius;

  public Circle(double radius) {
    this.radius = radius;
  }

  public double getArea() {
    return 3.1415 * radius * radius;
  }

  public double getPerimeter() {
    return 2 * 3.1415 * radius;
  }
}

class Triangle extends Shap {
  private double base;
  private double hight;

  public Triangle(double hight, double base) {
    this.hight = hight;
    this.base = base;
  }

  public double getArea() {
    return 0.5 * hight * base;
  }

  public double getPerimeter() {
    return hight + base + Math.sqrt(hight * hight + base * base);
  }
}

public class ShapArea {
  public static void main(String[] args) {
    Shap[] shaps = {
        new Rectangle(4343, 343),
        new Circle(248), new Triangle(232, 345)
    };
    for (Shap s : shaps) {
      System.out.println(s.getArea() + " " + s.getPerimeter());
    }
  }

}
