package interro.eial;

import java.io.IOException;

public class Exercice10 {
	public static void main( String[] args ) throws IOException
    {
		String firstNum = args[0];
		String sign = args[1];
		String secondNum = args[2];

		int firstInt = Integer.parseInt(firstNum);
		int secondInt = Integer.parseInt(secondNum);
		
		switch(sign) {
		case "+":
			System.out.println(firstInt + secondInt);
			break;
		case "-":
			System.out.println(firstInt - secondInt);
			break;
		case "/":
			System.out.println(firstInt / secondInt);
			break;
		case "*":
			System.out.println(firstInt * secondInt);
			break;
		case "^":
			System.out.println(Math.pow(firstInt,secondInt));
			break;
		}
    }
}
