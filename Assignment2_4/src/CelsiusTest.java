import java.util.*;
public class CelsiusTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double Celsius;
		double Fahrenheit;
		
		System.out.print("화씨온도를 입력하시오: ");
		Fahrenheit = sc.nextDouble();
		Celsius = (Fahrenheit - 32) * 5/9;
		System.out.println("섭씨온도는 "+Celsius);
	}

}
