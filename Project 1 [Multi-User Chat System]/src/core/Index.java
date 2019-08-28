package core;
import java.util.Scanner;
import users.*;
import chat.Room;

public class Index {
	
	public static void main(String args[])
	{
		String optn;
		
		Index obj = new Index();
		
		while(true)
		{
			optn = obj.SelectOption();
			
			if(optn.equalsIgnoreCase("//bye"))
			{
				System.out.println("Application Closed Successfully!");
				break;
			}
			else if(optn.equalsIgnoreCase("//help"))
			{
				System.out.println("Commands: //bye, //help, //users, //delete_all");
			}
			else if(optn.equalsIgnoreCase("//users"))
			{
				System.out.println("Users Available: //sami, //soaib, //arnab");
			}
			else if(optn.equalsIgnoreCase("//sami"))
			{
				User1 usr1 = new User1();
			}
			else if(optn.equals("//delete_all"))
			{
				Room chtObj = new Room();
				chtObj.MsgDelete();
			}
			else if(optn.equalsIgnoreCase("//soaib"))
			{
				User2 usr2 = new User2();
			}
			else if(optn.equalsIgnoreCase("//arnob"))
			{
				User3 usr3 = new User3();
			}
			
			
		}
		System.exit(0);
	}
	
	String SelectOption()
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Command: ");
		String usr = scan.nextLine();
		
		return usr;
	}

}
