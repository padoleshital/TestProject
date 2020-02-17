package test;

import java.io.*;

//program for accept single character from the keyboard
public class Accept_char {
	
	public static void main(String args[]) throws IOException
	{
		//create bufferedReader object  to accept data from the keyboard
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enetr the character");
		char ch = (char)br.read();
		System.out.println("You enterd :" + ch);
		
	}

}
