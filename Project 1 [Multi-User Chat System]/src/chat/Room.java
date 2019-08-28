package chat;
import java.io.*;

public class Room extends Thread{
	
	File chat = new File("chat.txt");
	
	public String chatText, User;
	public boolean flag;
	
	public Room()
	{
		
	}
	
	public Room(String chatText, String User, boolean flag)
	{
		this.chatText = chatText;
		this.User = User;
		this.flag = flag;
		
		if(chat.exists())
		{
			chatWrite();
			RefreshChat();
		}
		else
		{
			try
			{
				chat.createNewFile();
				chatWrite();
				RefreshChat();
			}
			catch(IOException e)
			{
				System.out.println("File Creation Problem: " + e);
			}
			
		}
	}
	
	void chatWrite()
	{
		try
		{
			if(this.flag == true)
			{
				FileWriter writer = new FileWriter(this.chat, true);
				writer.write("     " + this.chatText + "\n");
				writer.close();
			}
			else if(this.flag == false)
			{
				FileWriter writer = new FileWriter(this.chat, true);
				writer.write("\n " + this.User + ":\n" + " --> " + this.chatText + "\n");
				writer.close();
			}
			
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
	}
	
	public void RefreshChat()
	{
		try
		{
			System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
			System.out.println("// ======= LeyBook ======= \\ \n\n");
			BufferedReader Buffread = new BufferedReader(new FileReader(this.chat));
			String content = Buffread.readLine();
			while(content != null)
			{
				System.out.println(content);
				content = Buffread.readLine();
			}
			System.out.println("\n\n // ======================= \\ \n");
		}
		catch (IOException e)
		{
			System.out.println(e);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	public void MsgDelete()
	{
		try
		{
			FileWriter writer = new FileWriter(this.chat, false);
			writer.write("");
			writer.close();
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
	}

}
