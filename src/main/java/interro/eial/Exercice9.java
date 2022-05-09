package interro.eial;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Exercice9 {
	public static void main(String[] args) {

        ArrayList<String> orderedStr = new ArrayList<String>();

        for(int i = 0; i < args.length; i++) {
            orderedStr.add((String) args[i]);
        }
        Collections.sort(orderedStr, new Comparator<String>() {
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });

        for (String str: orderedStr) {
            System.out.println(str);
        }
    }
}
