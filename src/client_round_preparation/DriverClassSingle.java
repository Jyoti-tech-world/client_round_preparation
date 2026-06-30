package client_round_preparation;

public class DriverClassSingle {

	public static void main(String[] args) {
		
		Single s1= Single.INSTANCE;
		Single s2= Single.INSTANCE;
		
		System.out.println(s1==s2);
		
		s1.show();

	}

}
