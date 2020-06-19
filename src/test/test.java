package test;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class test {
	public static void main(String[] args) {
		int port = 3000;
		String serverIP;
		try {
			serverIP = InetAddress.getLocalHost().getHostAddress();
			System.out.println(serverIP);
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// commit please
		// commit -push & pull test please
	}
}
