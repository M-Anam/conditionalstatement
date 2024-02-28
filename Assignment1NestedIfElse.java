package conditionalstatement;

public class Assignment1NestedIfElse {

	public static void main(String[] args) {
		
		int a=25;
		int d=75;
		char b='M';
		char c='F';
		
		if(a>18 &&a<65) 
		{
			if(c=='F') {
				System.out.println("Half ticket");
			}
			else 
			{
				System.out.println("Full ticket");
			}
		}
		else
		{
			if(d>65 && b=='M'|| c=='F') 
			{
				System.out.println("Ticket for senior citizen");
			}
			else 
			{
				System.out.println("No conseesion");
			}	
		}

	}

}
