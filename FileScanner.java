package assignment;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
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
		ArrayList<String> Filescan = new ArrayList <String>();
		//Creating scanner to read through BadWords.txt
		Scanner wordsFile = new Scanner(new File(this.file));
		
		
		while(wordsFile.hasNextLine())
		{
			Filescan.add(wordsFile.nextLine());
		}
		return Filescan;
	}
		
	
		
}