package BankApplication;

/* @author: William Robert Howerton III
 * @version: 1.0.0
 * @purpose: The purpose of this class is to improve upon the Scanner class and provide added functionality usually
 *           implemented in the user classes. Methods used to check inputs for validity took up much space in other classes
 *           and are not modular, creating the need to redifine methods for every other class requiring such functionality.
 *	     This class allows the user to make instances of a "MoBettaScanner" (Read: More better Scanner) with specified
 *           max values, min values, lengths, overridden constructors for (double) maximum values, and so on... even a custom
 *           text prompt to print to the user when the scanner is called.
 *
 *
 */


import java.util.Scanner;
import java.util.regex.*;

public class MoBettaScanner {

	static Scanner in = new Scanner(System.in);
	
	private int maxInt;
	private int minInt;
	private double maxDouble;
	private double minDouble;
	private int minLength;
	private int maxLength;
	
	
	private String prompt;
	
	public MoBettaScanner(String textPrompt, int min, int max){
		this.prompt = textPrompt;
		this.minInt = min;
		this.maxInt = max;
		this.minLength = min;
		this.maxLength = max;
	}
	
	public MoBettaScanner(String textPrompt, double min, double max){
		this.prompt = textPrompt;
		this.minDouble = min;
		this.maxDouble = max;
	}
	
	private int getInt(){
		
		System.out.println(this.prompt);
        while (!in.hasNextInt()){
        		System.out.println("Must enter a numeric value.");
		        in.next();
        }
       
        int input = in.nextInt();
        
        return input;
       
       
	}
	
	public int intGet(){
		int val = getInt();
		while (val < this.minInt | val > this.maxInt){
			System.out.println("Must be greater than " + this.minInt + " and lesser than " + this.maxInt);
			val = getInt();
		}
		return val;
	}
	
	public double doubleGet(){
		double val = getDouble();
		
		while (val < this.minDouble | val > this.maxDouble){
			System.out.println("Must be greater than " + this.minDouble + " and lesser than " + this.maxDouble);
			val = getDouble();
		}
		return val;
	}
	
	public String stringGet(){
		String val = getString();
		
		while (!val.matches("[a-zA-Z]+")){
			
			System.out.println("Must enter letters only.");
			val = getString();
			
			while (val.length() < this.minLength | val.length() > this.maxLength){
				System.out.println("Must be longer than " +this.minLength + " and shorter than "+this.maxLength+" characters long.");
				val = getString();
			}
		}
		
		return val;
	}
	
	private double getDouble(){
		System.out.println(this.prompt);
        while (!in.hasNextDouble()){
        		System.out.println("Must enter a numeric value.");
		        in.next();
        }
        double input = in.nextDouble();
        
        return input;       
	}
	
	private String getString(){
		System.out.println(this.prompt);
		
		while (!in.hasNext()){
			System.out.println(this.prompt);
			in.next();
		}
		
		String input = in.next();
		
		return input;
	}



public void setMinInt(int newMinInt){
	this.minInt = newMinInt;
}

public void setMinDouble(double newMinDouble){
	this.minDouble = newMinDouble;
}

public void setMaxInt(int newMaxInt){
	this.maxInt = newMaxInt;
}
public void setMaxDouble(double newMaxDouble){
	this.maxDouble = newMaxDouble;
}

public void setMaxLength(int newMaxLength){
	this.maxLength = newMaxLength;
}
public void setMinLength(int newMinLength){
	this.minLength = newMinLength;
}
}
