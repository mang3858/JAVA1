
public class Person {
	String name;
	float height;
	float weight;
	
	public Person(){
	
	}
	
	public Person(String name, float height, float weight) {
		this.name = name;
		this.height = height;
		this.weight = weight;
	}
	
	void print() {
		System.out.printf("이름: %s,키: %.1f, 몸무게: %.1f\n", name, height, weight);
	}
}
