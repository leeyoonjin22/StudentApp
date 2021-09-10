import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Main {
	
	static ArrayList<Student> st = new ArrayList<Student>();
	
	public void sorting() {
		  java.util.Collections.sort(st);
		 }
	
	public static void main(String[] args) {
		
		System.out.println("Student List (ordered by name)");
		Student s1 = new Student("Minsu");
		st.add(s1);
		Student s2 = new Student("Amy");
		st.add(s2);
		Student s3 = new Student("su");
		st.add(s3);
		Student s4 = new Student("bb");
		st.add(s4);
		Student s5 = new Student("sol");
		st.add(s5);
		Student s6 = new Student("Hye");
		st.add(s6);
		Student s7 = new Student("JJ");
		st.add(s7);
		Student s8 = new Student("Duk");
		st.add(s8);
		Student s9 = new Student("Bu");
		st.add(s9);
		Student s10 = new Student("Tak");
		st.add(s10);
		
	
		
		Collections.sort(st);
		
		for(Student s : st) {
			System.out.println(s.toString());
		}
		
		
	}

	@Override
	public String toString() {
		return "Main [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
}
