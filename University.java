
class Department {
  private String name;
}

class Teacher extends Department {
  private String name;
  private String id;
  private String address;
  private double salary;

}

class Student extends Department {
  private String name;
  private String id;
  private String address;
}

class Course extends Teacher {
  private String title;
  private String course_code;

}

public class University {
  public static void main(String[] args) {

  }
}
