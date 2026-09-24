
class Teacher {
  private String name;
  private String id;
  private int salar;

  Teacher(String name, String id) {
    this.name = name;
    this.id = id;
  }
}

class Student extends Teacher {
  private double gpa;

  Student(String name, String id, double gpa) {
    this.gpa = gpa;
    super(name, id);
  }
}

public class Super {
  public static void main(String[] args) {

  }
}
