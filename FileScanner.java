package assignment;

import java.io.*;
import java.util.Scanner;

public class FileScanner 
{
	public static void main(String args[]) throws IOException
	{
		Scanner file = new Scanner(new File("src/assignment/BadWords.txt"));
		
		while(file.hasNext())
		{
			String s = file.nextLine().trim();
			System.out.println(s);
		}
	}
}
