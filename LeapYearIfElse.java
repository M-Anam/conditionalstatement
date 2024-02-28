package conditionalstatement;

public class LeapYearIfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=2024;
		int b=2027;
		
		if(a%4==0) {
			System.out.println("2024 is leap year");
		}
		else {
			System.out.println("2024 is not a leap year");
		}
		
		if(b%4==0) {
			System.out.println("2027 is leap year");
		}
		else {
			System.out.println("2027 is not a leap year");
		}
	}

}
