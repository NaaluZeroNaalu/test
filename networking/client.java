import java.net.*;
import java.io.*;

class client
{
  public static void main(String[] args)
  {
	  try
	  {
		 Socket s = new Socket("127.0.0.1",3000);
	     System.out.println("CONNECTED");
	  }
	  catch(Exception e)
	  {
		  System.out.println(e);
	  }
  }
}