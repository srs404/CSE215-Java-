package core;
import myexp.*;
import java.util.Scanner;

public class Index {
	
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		Index obj = new Index();
		int id = 0, year = 0, sem = 0;
		boolean flag = false;
		
		try
		{
			System.out.print("NSU ID: ");
			id = scan.nextInt();
			
			int counter = obj.CheckID(id);
			year = obj.checkYear(id);
			sem = obj.checkSem(id);
			flag = true;
		}
		catch(InvalidIDException e)
		{
			System.out.println(e);
			System.out.println("\n\n");
			id = e.id();
			year = obj.checkYear(id);
			sem = obj.checkSem(id);
			flag = true;
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			if(flag == true)
			{
				if(sem == 1)
				{
					System.out.println("ID: " + id + "\nSemester: Spring \nAdmission Year: 20" + year);
				}
				else if(sem == 2)
				{
					System.out.println("ID: " + id + "\nSemester: Summer \nAdmission Year: 20" + year);
				}
				else if(sem == 3)
				{
					System.out.println("ID: " + id + "\nSemester: Fall \nAdmission Year: 20" + year);
				}
			}
			else
			{
				System.out.println("Invalid ID Provided!");
			}
			
		}
	}
	
	int CheckID(int id) throws InvalidIDException
	{
		int count = 0, i;
		for(i = id; i > 0; i = i/10)
		{
			count = count + 1;
		}
		if(count != 10)
		{
			throw new InvalidIDException("Invalid ID!");
		}
		return count;
	}
	
	int checkYear(int id)
	{
		for(int i = 0; i < 8; i++)
		{
			id = id / 10;
		}
		return id;
	}
	
	int checkSem(int id)
	{
		int sem = 0;
		for(int i = 0; i < 8; i++)
		{
			sem = id % 10;
			id = id / 10;
		}
		return sem;
	}
	

}
