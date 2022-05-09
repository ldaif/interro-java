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

public class Exercice4{
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
            File sourceFile = new File(args[0]);
            File outFile = new File(args[1]);

            if (outFile.exists()) {
                Scanner content = new Scanner(sourceFile);
                PrintWriter pwriter = new PrintWriter(outFile);

                while (content.hasNextLine()) {
                    String s = content.nextLine();
                    StringBuffer buffer = new StringBuffer(s);
                    buffer = buffer.reverse();
                    String rs = buffer.toString();
                    pwriter.println(rs);
                }
                content.close();
                pwriter.close();
            }
        } catch (Exception e) {
            System.out.println("Something went wrong");
        }
    }
}
