package conditionalstatement;

public class NestedIfElse2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=100;
		int b=200;
		
		
		if(a<b) 
		{
			if(a<500) {
				
				if(a>1000) 
				{
					System.out.println("Logic1");
				}
				else 
				{
					System.out.println("Logic4");
				}
			}
			else 
			{
				System.out.println("Logic2");
			}
		}
		else
		{
			System.out.println("Logic3");	
		}
	}

}
