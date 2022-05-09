package interro.eial;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;
import java.util.logging.FileHandler;

/**
 * Hello world!
 *
 */
public class Exercice3{
	public static void main(String[] args) {

        if (args.length != 2) {
            System.out.println("Limite d'argument : 2");
            return;
        }
        File srcFile = new File(args[0]);
        File destFile = new File(args[1]);
        FileReader fr = null;
        FileWriter fw = null;
        try {
            fr = new FileReader(srcFile);
            fw = new FileWriter(destFile, true);
            int c = fr.read();
            fw.write("\r\n");
            while (c != -1) {
                fw.write(c);
                c = fr.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            close(fr);
            close(fw);
        }
    }
	
	public static void close(Closeable stream) {
        try {
            if (stream != null) {
                stream.close();
            }
        } catch (IOException e) {
        }
    }
}
