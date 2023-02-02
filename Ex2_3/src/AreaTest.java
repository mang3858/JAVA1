
public class AreaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final double lightSpeed = 30e4;
		double distance = 40e12;
		double secs;
		
		secs = distance / lightSpeed;
		
		double lightYear = secs/(60.0*60.0*24.0*365.0);
		System.out.println("걸리는 시간은 " + lightYear+"광년입니다. ");
		
	}

}
