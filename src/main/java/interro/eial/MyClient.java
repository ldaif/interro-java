package interro.eial;

import java.io.DataOutputStream;
import java.net.Socket;

public class MyClient {
	public static void main(String[] args) {
        try {
            Socket s = new Socket("localhost", Integer.parseInt(args[0]));
            DataOutputStream dout = new DataOutputStream(s.getOutputStream());
            dout.writeUTF("HELLO");
            dout.flush();
            dout.close();
            s.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
