package assignment;

import java.io.FileNotFoundException;

public class Main 
{
	public static void main(String args[]) throws FileNotFoundException
	{
		FileScanner file = new FileScanner("src/assignment/BadWords.txt");
		System.out.println(file.Scanner());
	}
}
