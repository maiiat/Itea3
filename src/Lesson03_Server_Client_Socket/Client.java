package Lesson03_Server_Client_Socket;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;

public class Client {

	
	/**
	public static void main(String[] args) {
		 try {
		 Socket s = new Socket(InetAddress.getByName("172.17.13.171"),3134);
		 String message = "...";
		 s.getOutputStream().write(message.getBytes());
		 byte[] buff = new byte[64*1024];
		 int r=s.getInputStream().read(buff);
		 message = new String(buff,0,r);
		 System.out.println(message);
		 } catch (IOException e) {
		 e.printStackTrace();
		 }
		}*/
	
	public static void main(String[] args) {
		 try {
		 Socket s = new Socket(InetAddress.getByName("172.17.13.171"),3134);
		 String message = "/////////";
		 s.getOutputStream().write(message.getBytes());
		 byte[] buff = new byte[64*1024];
		 int r=s.getInputStream().read(buff);
		 message = new String(buff,0,r);
		 System.out.println(message);
		 } catch (IOException e) {
		 e.printStackTrace();
		 }
	
	
		}
}