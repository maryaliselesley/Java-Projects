	//Maryalise Lesley 
	//Regex Homework project 
	//This program verifies that a file name follows the Unix naming rules 
import java.util.regex.*; 
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class RegexHW1 {

		public static void main(String[] args) {
		String filename = "Filename1$" ;
		String regex =  "^[a-zA-Z0-9._-]+$";
		 Pattern pattern = Pattern.compile(regex);
		 Matcher matcher = pattern.matcher(filename);
		 if (matcher.matches()) {
	            System.out.println("The filename conforms to Linux rules.");
	        } else {
	            System.out.println("The filename does not conform to Linux rules.");
	        }
	    }
	
		}

