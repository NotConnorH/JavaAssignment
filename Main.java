package assignment;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Main 
{
	public static void main(String args[]) throws FileNotFoundException
	{
		FileScanner file1 = new FileScanner("src/assignment/BadWords.txt");
		FileScanner file2 = new FileScanner("src/assignment/ListOfExamples.txt");

		
		BadWordCompare abusiveWords = new BadWordCompare(file1.Scanner(), file2.Scanner());
		
		abusiveWords.FindBadWords();
	}
}
