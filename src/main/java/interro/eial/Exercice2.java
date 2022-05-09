package interro.eial;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Exercice2 {
	public static void main( String[] args ) throws IOException {
		String src = args[0];
		String dest = args[1];
		
		InputStream input = null;
		OutputStream output = null;
		
		input = new FileInputStream(src);
		output = new FileOutputStream(dest);
		byte[] buffer = new byte[1024];
		int length;
		while ((length = input.read(buffer)) > 0) {
			output.write(buffer, 0, length);
		}
		input.close();
		output.close();
	}
}
