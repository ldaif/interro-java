package interro.eial;

import java.io.IOException;
import java.net.Socket;

public class Exercice1{
    public static void main( String[] args ) {
    	String hostName = "localhost";
		int portNumber = 62342;
		byte[] b = new byte[1024];
		String fromUser;
		
		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i] + " ");
		}
    }
}
