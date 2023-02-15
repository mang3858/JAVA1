
public class Student {
	String name;
	String rollno;
	int age;
	
	public Student(String n, String r, int a) {
		this.name = n;
		this.rollno = r;
		this.age =a;
	}
	
	void print() {
		System.out.println("이름: "+ name);
		System.out.println("학번: "+ rollno);
		System.out.println("나이: "+ age);
	}
}
