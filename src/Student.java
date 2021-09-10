
public class Student implements Comparable<Student> {
	 private String name;
	 
	 Student(String name) {
	  this.name = name;
	 }

	 public String getName() {
	  return name;
	 }

	 public int compareTo(Student s) {
	  return name.compareTo(s.name);
	 }

	@Override
	public String toString() {
		return "Student [name=" + name + "]";
	} 
	}

