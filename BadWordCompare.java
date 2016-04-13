package assignment;

import java.util.ArrayList;

public class BadWordCompare 
{
	//Creating ArrayLists for both files
	private ArrayList<String> file1;
	private ArrayList<String> file2;
	
	//Creating Constructor
	public BadWordCompare(ArrayList<String> file1, ArrayList<String> file2) 
	{
		this.file1 = file1;
		this.file2 = file2;
	}//End Constructor

	
	void FindBadWords()
	{	
		int AbuseDetected = 0; //Changes to 1 if a bad word is found
		//int CapsDetected = 0; // Changes to 1 if bad word is all caps
		
		//Compares each line of the Examples file against the list of BadWords
		for (String line : file2)
		{
			for (String word : file1)
			{
				//If the post contains an abusive word, sets to 1
				if( (line.contains(word)) )
				{
					AbuseDetected = 1;
					break;
				}//End if
				
				/*
				if( (line.isUpperCase()) )
				{
					CapsDetected = 1;
				}//End if
				*/
				
				//If the post doesn't contain an abusive word, sets to 0
				else
				{
					AbuseDetected = 0;
				}//End else
				
			}//End inner for
			
			
			//Tells user this post contains an abusive word
			if(AbuseDetected == 1)
			{
				System.out.println("'" + line + "'    " + "This post is abusive, please alter it");
			}//End if
			
			/*  
			//Tells the user this bad word should be lower case
			else if(AbuseDetected == 1 && CapsDetected == 1)
			{
				System.out.println("'" + line + "'    " + "This post is abusive and too loud, please alter it");
			}
			*/
			
			//Tells user this post is clean
			else
			{
				System.out.println("'"+ line + "'    " + " Post not abusive, you're so lovely");
			}//End else
		
		}//End outer for
		
	}//End method FindBadWords
	
}//End class BadWordCompare
	
