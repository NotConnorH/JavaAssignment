package assignment;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class FileScanner 
{
	private String file;
	
	FileScanner(String file)
	{
		this.file = file;
	}
	
	
	ArrayList<String> Scanner() throws FileNotFoundException
	{	
	
		//Creates ArrayList that contains the Bad Words
		ArrayList<String> fileScan = new ArrayList <String>();
		//Creating scanner to read through BadWords.txt
		Scanner wordsFile = new Scanner(new File(this.file));
		
		//Scans the file line by line
		while(wordsFile.hasNextLine())
		{
			fileScan.add(wordsFile.nextLine());
		}//End While
		return fileScan;
	}//End File scanning

}//End FileScanner class