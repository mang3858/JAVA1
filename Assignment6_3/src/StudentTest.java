import java.util.*;
public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String name;
		String rollno;
		int age;
		
		System.out.print("이름을 입력하세요: ");
		name = sc.next();
		System.out.print("학번을 입력하세요: ");
		rollno = sc.next();
		System.out.print("나이을 입력하세요: ");
		age = sc.nextInt();
		
		Student s = new Student(name, rollno, age);
		s.print();
	}

}
