package Lesson03_Server_Client_Socket;

import java.net.ServerSocket;
import java.net.Socket;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;

public class Server extends Thread {
	Socket s;
	int counter;

	Server(Socket s, int counter) {
		this.s = s;
		setDaemon(true);
		start();
	}

	@Override
	public void run() {
try {
	InputStream is = s.getInputStream();
	OutputStream os = s.getOutputStream();
	byte [] buff = new byte[64*1024];
	int r = is.read(buff); // array of bytes
	String message = new String(buff, 0, r);
	System.out.println("Server accepted: "+message);
	message = "Hello from server. I received: " +message;
	os.write(message.getBytes());
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
	}

	public static void main(String[] args) {
		try {
			ServerSocket ss = new ServerSocket(3134, 0, InetAddress.getByName("172.17.13.88"));
			System.out.println("Server ready....");
			int i=1;
			while (true) {
				new Server (ss.accept(), i++);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
