package interro.eial;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class Exercice5 {
	public static void main( String[] args ) throws IOException {
		try {
            ServerSocket ss = new ServerSocket(Integer.parseInt(args[0]));
            Socket s = ss.accept();// establishes connection
            DataInputStream dis = new DataInputStream(s.getInputStream());
            String str = (String) dis.readUTF();
            System.out.println(str);
            ss.close();
        } catch (Exception e) {
            System.out.println(e);
        }
	}
}
