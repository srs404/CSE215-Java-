package myexp;
import java.util.Scanner;

public class InvalidIDException extends Exception{
	
	public InvalidIDException(String s)
	{
		super(s);
	}
	
	public int id()
	{
		int id, count = 0;
		while(true)
		{
			id = getID();
			
			for(int j = id; j > 0; j = j / 10)
			{
				count = count + 1;
			}
			if(count == 10)
			{
				break;
			}
			count = 0;
		}
		return id;
	}
	
	int getID()
	{
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Valid ID: ");
		return scan.nextInt();
		
	}

}
