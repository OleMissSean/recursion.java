//Sean Staz
//CSci 112
//Java II

public class Recursion 
{
	public static void main(String [] args)
	{
		int s = 1;
		Rec(s);
	}
		
	public static void Rec(int s)
	{
		Print(s);	
		System.out.println();
		if(s < 5)
		{
			Rec(s+1);
		}
		
		Print(s-1);
		System.out.println();
	}
	
	public static void Print(int s)
	{
		for (int i = 0; i < s; i++)
		{
			System.out.print("*");
		}
	}
}

