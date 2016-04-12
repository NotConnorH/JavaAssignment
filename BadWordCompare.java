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
	}

	
	void FindBadWords()
	{	
		//Changes to 1 if a bad word is found
		int AbuseDetected = 0; 
		
		//Compares each line of the Examples file against the list of BadWords
		for (String line : file2)
		{
			for (String word : file1)
			{
				//If the post contains an abusive word, sets to 1
				if((line.contains(word)))
				{
					AbuseDetected = 1;
					break;
				}//End if
				
				//If the post doesn't contain an abusive word, sets to 0
				else
				{
					AbuseDetected = 0;
				}//End else
				
			}//End for
			
			//Tells user this post contains an abusive word
			if(AbuseDetected == 1)
			{
				System.out.println("'" + line + "'    " + "This post is abusive, please alter it");
			}
			//Tells user this post is clean
			else
			{
				System.out.println("'"+ line + "'    " + " Post not abusive, you're so lovely");
			}//End else
		
		}//End for
		
	}//End method FindBadWords
	
}//End class BadWordCompare
	
	