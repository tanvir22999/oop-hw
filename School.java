
/*
Create	a	class	"School"	with	attributes	for	students,	teachers,	and	classes,	and	methods	to
add/remove	students	and	teachers,	and	to	create	classes.
 */

import java.util.ArrayList;

public class School {
  private ArrayList<String> students = new ArrayList<>();
  private ArrayList<String> teachers = new ArrayList<>();
  private ArrayList<String> classes = new ArrayList<>();

  public void addStudents(String student) {
    students.add(student);
    System.out.println("New Student Added:" + student);
  }

  public void addTeachers(String tearcher) {
    teachers.add(tearcher);
    System.out.println("New Student Added:" + tearcher);
  }

  public void removeStudents(String student) {
    students.remove(student);
    System.out.println("Delete the Student:" + student);
  }

  public void removeTeachers(String teacher) {
    teachers.remove(teacher);
    System.out.println("Delete the teacher:" + teacher);
  }

  public void createClasses(String classes) {
    this.classes.add(classes);
    System.out.println("add new class:" + classes);
  }

  public void display() {
    System.out.println("Students: " + students);
    System.out.println("Teachers: " + teachers);
    System.out.println("Classes: " + classes);
  }

  public static void main(String[] args) {
    School school = new School();
    for (int i = 1; i < 4; i++) {
      school.addStudents("Tanvir" + i);
      school.addTeachers("xyz" + i);
      school.createClasses("OOP" + i);
    }
    school.display();
    System.out.println();
    school.removeStudents("Tanvir2");
    school.removeTeachers("xyz3");
    System.out.println();
    school.display();
  }
}
