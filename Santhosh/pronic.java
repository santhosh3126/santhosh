import java.util.Scanner;
class Pronic 
{
	static Scanner sc=new Scanner (System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter The Num*ber");
		int num=sc.nextInt();
		int ans=0;

		for (int i=0;i<num ;i++ )
		{
			if (i*(i+1)== num)
			{
				ans=1;

				break;
			}
			
		}
		if (ans ==1)
		{
		 
		 System.out.println("*It is a Pronic number");

		}
		else
		{
			
		System.out.println("It is not a Pronic number");

		}
	}
}