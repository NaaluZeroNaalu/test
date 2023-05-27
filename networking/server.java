import java.net.*;
import java.io.*;
import java.util.*;

class server
{
  public static void main(String[] args)
  {
	  
	 try
	 {
		  ServerSocket ss = new ServerSocket(3000);
	      System.out.println(ss);
	      System.out.println("WAITING......");
	      Socket s = ss.accept();
	      System.out.println("CONNECTED"+s);
	      ss.close();
	 }
	 catch(Exception e)
	 {
		 System.out.println(e);
	 }
	  
  }
}