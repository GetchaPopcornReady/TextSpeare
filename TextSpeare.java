package jjv.NQ;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class TextSpeare
{

	public static void main(String[] args)
	{
		
		
		

		//ArrayList<String []> MessageList = new ArrayList<String []>();
		
		final String FILENAME = "Messages with Keeks!.txt";

		Scanner input = null;
		try
		{
			input = new Scanner(new File(FILENAME));
		}
		catch (FileNotFoundException e)
		{
			System.out.println("Unable to open input file " + FILENAME);
			System.exit(1);
		}
		
		ArrayList<String> FIRSTlist = new ArrayList<String>();
		ArrayList<String> MIDDLElist = new ArrayList<String>();
		ArrayList<String> FULLlist = new ArrayList<String>();
		
		//Put the entire line in attempt
		ArrayList<String> WHOLElist = new ArrayList<String>();
		
		
			//6 Lines of start crap
			input.nextLine();
			input.nextLine();
			input.nextLine();
			input.nextLine();
			input.nextLine();
			input.nextLine();
			
			
			while (input.hasNext())
			{
				
			input.nextLine(); //Name and time line
			
			String P1Line = input.nextLine();
			String[] onePerson = P1Line.split(" ");
			
			if(onePerson.length == 1)
			{
				input.nextLine();
				
			}
			if(onePerson[0].equals("*"))
			{
				input.nextLine();
			}
			if(onePerson[0].equals("---"))
			{
				input.nextLine();
				input.nextLine();
			}
			
			if(onePerson.length >= 8)
			{
			String firstWord = onePerson[2];
			String secondWord = onePerson[3];
			
			String firstAndsecond = firstWord + " " + secondWord;
 			FIRSTlist.add(firstAndsecond);
 			
 			String thirdWord = onePerson[4];
 			String fourthWord = onePerson[5];
 			String fifthWord = onePerson[6];
 			String sixthWord = onePerson[7];
 			 			
 			String fourWords = thirdWord + " " + fourthWord + " " + fifthWord + " " + sixthWord;
 			String fullSentence = firstWord + " " + secondWord + " " + thirdWord + " " + fourthWord + " " + fifthWord + " " + sixthWord;
 				
 			MIDDLElist.add(fourWords);
 			FULLlist.add(fullSentence);
 			
 			String WORD_WHOLE = Arrays.toString(onePerson);
 			WHOLElist.add(WORD_WHOLE);
 			
			//System.out.println(firstWord + " " + secondWord);
			}
			
			if(onePerson.length == 3)
			{
				String firstWord = onePerson[2];
				FIRSTlist.add(firstWord);
				//System.out.println(firstWord);
			}
			
			input.nextLine(); //blank space line
		

		}
				input.close();
			
	////////////////////
	///END READING FILE
	////////////////////
				
				
			Random random = new Random();
			
			
			int randomFirstList1 = random.nextInt(FIRSTlist.size())+ 1;
			int randomFirstList2 = random.nextInt(FIRSTlist.size())+ 1;
			int randomFirstList3 = random.nextInt(FIRSTlist.size())+ 1;
			int randomFirstList4 = random.nextInt(FIRSTlist.size())+ 1;
			int randomFirstList5 = random.nextInt(FIRSTlist.size())+ 1;
			int randomFirstList6 = random.nextInt(FIRSTlist.size())+ 1;
			int randomFirstList7 = random.nextInt(FIRSTlist.size())+ 1;
			
			int randomMiddleList1 = random.nextInt(MIDDLElist.size())+ 1;
			int randomMiddleList2 = random.nextInt(MIDDLElist.size())+ 1;
			int randomMiddleList3 = random.nextInt(MIDDLElist.size())+ 1;
			int randomMiddleList4 = random.nextInt(MIDDLElist.size())+ 1;
			int randomMiddleList5 = random.nextInt(MIDDLElist.size())+ 1;
				
			
			int randomFullList1 = random.nextInt(FULLlist.size() + 1);
			int randomFullList2 = random.nextInt(FULLlist.size() + 1);
			int randomFullList3 = random.nextInt(FULLlist.size() + 1);
			int randomFullList4 = random.nextInt(FULLlist.size() + 1);
			
//			Poem Algorithm Structure
			System.out.println("        " + FIRSTlist.get(randomFirstList7).toUpperCase() + "\n\n");
			System.out.println(FIRSTlist.get(randomFirstList1) + " " + MIDDLElist.get(randomMiddleList1));
			System.out.println(FIRSTlist.get(randomFirstList2) + " " + MIDDLElist.get(randomMiddleList2) + ",");
			System.out.println(MIDDLElist.get(randomMiddleList3));
			System.out.println(FIRSTlist.get(randomFirstList3) + ", " + FIRSTlist.get(randomFirstList4) + ", " + FIRSTlist.get(randomFirstList5) + ",");
			System.out.println(FIRSTlist.get(randomFirstList6) + " " + MIDDLElist.get(randomMiddleList4) + ",");
			System.out.println(MIDDLElist.get(randomMiddleList5) + ".");
			
			
			//REPEAT Structure
//			System.out.println("        " + FIRSTlist.get(randomFirstList7).toUpperCase() + "\n");
//			System.out.println(FIRSTlist.get(randomFirstList1) + " " + MIDDLElist.get(randomMiddleList1));
//			System.out.println(FIRSTlist.get(randomFirstList2) + " " + MIDDLElist.get(randomMiddleList2) + ",");
//			System.out.println(FIRSTlist.get(randomFirstList1) + " " + MIDDLElist.get(randomMiddleList1));
//			System.out.println(FIRSTlist.get(randomFirstList6) + " " + MIDDLElist.get(randomMiddleList4) + ",");
//			System.out.println(FIRSTlist.get(randomFirstList1) + " " + MIDDLElist.get(randomMiddleList1));

			
			System.out.println("\n");
			System.out.println("Full List Attempt \n");
			System.out.println(FULLlist.get(randomFullList1));
			System.out.println(FULLlist.get(randomFullList2));
			System.out.println(FULLlist.get(randomFullList3));
			System.out.println(FULLlist.get(randomFullList4));
			
			
////////////////////////////////////////////////////////////////////	
			
			//Pass entire line attempt
			System.out.println("\n PASS ENTIRE LINE ATTEMPT");
//1
			System.out.println("WHOLElist = " + WHOLElist);
			String formatedString1 = WHOLElist.get(randomFullList1)
				    .replace(",", "")  //remove the commas
				    .replace("[", "")  //remove the right bracket
				    .replace("]", "")  //remove the left bracket
				    .trim();           //remove trailing spaces from partially initialized arrays
			
			formatedString1.substring(2);
			
			System.out.println(formatedString1.substring(2));
			
			//correctly grabs the last word in the string
			int subNumber = formatedString1.lastIndexOf(" ");
			String RhymeWord = formatedString1.substring(subNumber + 1);
			System.out.println(RhymeWord);
			
			//need to get similar phrases with that last word in it
			//traverse the list
			for (int i = 0; i < WHOLElist.size(); i++) 
			{
				
				int indexOFlastWord = WHOLElist.get(i).lastIndexOf(" ");				
				System.out.println(WHOLElist.get(i).lastIndexOf(" "));
				
				
			}
			
			

//2
			String formatedString2 = WHOLElist.get(randomFullList2)
				    .replace(",", "")  //remove the commas
				    .replace("[", "")  //remove the right bracket
				    .replace("]", "")  //remove the left bracket
				    .trim();           //remove trailing spaces from partially initialized arrays
			
			formatedString2.substring(2);
			
			System.out.println(formatedString2.substring(2));
			
//3
			String formatedString3 = WHOLElist.get(randomFullList3)
				    .replace(",", "")  //remove the commas
				    .replace("[", "")  //remove the right bracket
				    .replace("]", "")  //remove the left bracket
				    .trim();           //remove trailing spaces from partially initialized arrays
			
			formatedString3.substring(2);
			
			System.out.println(formatedString3.substring(2));
			
//4
			String formatedString4 = WHOLElist.get(randomFullList4)
				    .replace(",", "")  //remove the commas
				    .replace("[", "")  //remove the right bracket
				    .replace("]", "")  //remove the left bracket
				    .trim();           //remove trailing spaces from partially initialized arrays
			
			formatedString4.substring(2);
			
			System.out.println(formatedString4.substring(2));

//////////////////////////////////////////////////////////////////////////
			
			
			//Poem Ideas
//Rhymes....if the last 2 or 3 letters same.
//Love......Add in words that can make it lovey dovey
//MothaFuker Version....Add in random rap strings "Ya Bitch" "Yeh MothaFucker" "Nigga" "Damn Right" "Young Metra Dont trust ya" "Please" "Pussy" 
			
			
			
			
//Clean it up...delete any commas or things like that maybe
			
			
			

	}

	


}


