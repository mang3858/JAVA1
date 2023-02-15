import java.util.*;

public class PersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String name;
		float height;
		float weight;
		
		Person p1 = new Person();
		p1.name = "홍길동";
		p1.height = 163.0f;
		p1.weight = 48.5f;
		
		System.out.print("이름은? : ");
		name = sc.next();
		System.out.print("키는? : ");
		height = sc.nextFloat();
		System.out.print("몸무게는? : ");
		weight = sc.nextFloat();
		Person p2 = new Person(name, height, weight);
		
		p1.print();
		p2.print();
		
	}

}
