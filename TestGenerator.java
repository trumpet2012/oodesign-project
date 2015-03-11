package BankApplication;
import java.util.Random;


public class TestGenerator {
	
	Hashtable<TestGenerator, String> = new Hashtable<TestGenerator, String>();
	private Random r = new Random();
	private Customer _cust;
	private CreditReport _cred;
	private ChexSystems _chex;
	
	final String ALPHABET = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
	final String HEX_ALPHABET = "abcdefABCDEF0123456789";
	final int NUM_IN_HEX = HEX_ALPHABET.length();
	final int NUM_IN_ALPHABET = ALPHABET.length();
	
	
	public TestGenerator(int amountOfTests){
		this._cust = new Customer(nameGen(2,50), r.nextInt(100));
		this._cred = new CreditReport(r.nextInt(100), r.nextInt(100), r.nextInt(100), r.nextDouble()*2000000000, r.nextDouble()*2000000000, 
				r.nextInt(100));
		this._chex = new ChexSystems();
	}
	
	
	private String nameGen(int minLength, int maxLength){
		String temp = "";
		for (int i = minLength; i <= maxLength; i++){
			temp += ALPHABET.charAt(r.nextInt(NUM_IN_ALPHABET));
		}
		return temp;
	}
	
	private String custIDGen(int length){
		String temp = "";
		for(int i = 0; i < length; i++){
			temp+=(HEX_ALPHABET.charAt(r.nextInt(NUM_IN_HEX)));
		}
		
		return temp;
		
	}
	
	
}
