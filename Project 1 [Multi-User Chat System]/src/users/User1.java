package users;

import java.util.Scanner;
import chat.*;

public class User1 extends Thread{
	
	Room chtObj = new Room();
	static String username = "Sami";
	boolean flag = false;
	
	public User1()
	{
		
		chtObj.RefreshChat();
		chat();
	}
	
	synchronized void chat()
	{
		String cht;
		while(true)
		{
			cht = SelectOption(); //My Chat Messages
			
			if(cht.equalsIgnoreCase("//logout"))
			{
				System.out.println(username + " Logged Out Successfully!");
				break;
			}
			else if(cht.equalsIgnoreCase("//help"))
			{
				System.out.println("Commands: //bye, //help, //users, //logout");
			}
			else if(cht.equalsIgnoreCase("//users"))
			{
				System.out.println("Users Available: //sami, //soaib, //arnab");
			}
			else if(cht.equalsIgnoreCase("//bye"))
			{
				System.exit(0);
			}
			else if(cht.equals(""))
			{
				
				chtObj.RefreshChat();
			}
			else
			{
				Room myChat = new Room(cht, username, flag);
				flag = true;
			}	
		}
		
	}
	
	String SelectOption()
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.print("chat@" + username + ": ");
		String usr = scan.nextLine();
		
		return usr;
	}


}
