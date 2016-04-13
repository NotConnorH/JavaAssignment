package assignment;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class FileWrite 
{
	private static String word;
	
	FileWrite(String word)
	{
		FileWrite.word = word;
	}//End constructor
	
	void writebadword(String word) throws FileNotFoundException
	{			
		File badwordsfile = new File ("src/assignment/BadWords.txt");
		BufferedWriter bw = null;
		try
		{
			
			FileWriter fw = new FileWriter(badwordsfile);
			bw = new BufferedWriter(fw);
			bw.write(word);
			bw.close();
		}//End try
		
		catch(IOException e)
		{
			e.printStackTrace();
		}//End catch
		
	}//End writebadword
	
}//End class FileWrite
