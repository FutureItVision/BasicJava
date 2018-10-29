package com.wordoccurrences.test;

import com.wordoccurrences.controller.WordCountCase;
import org.testng.annotations.Test;
public class WordCountTest extends WordCountCase {
	
	@Test
	public void wordCountTest() {
		WordCountWithCaseSensitive();
	}

	
	
	/*Test run instruction  :
		
		1)Right click on this class and Run as TestNg.
        2)Consle you will see message {{Write your word  here :}}
        example : This is my book My book is my everything .
        3)Write some word combination of lowercase ,uppercase and same word 
        4)Than enter and you will see word count result  
	*/

}
