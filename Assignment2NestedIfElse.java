package conditionalstatement;

public class Assignment2NestedIfElse {

	public static void main(String[] args) {
		int a=65;
		
		if(a>60) {
				System.out.println("Senior Citizen");
		}
		else if(a<=60 && a>=18) {
				System.out.println("Adult");			
			}
		else if (a<18 && a>=13) {
			System.out.println("Teenager");
		}
		else {
			System.out.println("Child");
		}
	}
}