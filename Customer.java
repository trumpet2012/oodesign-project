package BankApplication;
import java.util.Random;
import java.util.UUID;


public class Customer {
	private MoBettaScanner nameS = new MoBettaScanner("Please enter your name: ", 2, 50);
	private MoBettaScanner ageS = new MoBettaScanner("Please enter your age: ", 14, 99);
	private MoBettaScanner latePayments = new MoBettaScanner("Please enter total number of late payments you've made, if any: ", -1, 101);
	private MoBettaScanner startBalance = new MoBettaScanner("Please enter your starting balance: ", 1, 2000000000.0);
	private MoBettaScanner credInquiries = new MoBettaScanner("Please enter the number of recent credit inquiries: ", -1, 99);
	private MoBettaScanner credBalance = new MoBettaScanner("Please enter your current outstanding credit card balance.", -1, 2000000000.0);
	private MoBettaScanner credHistory = new MoBettaScanner("Please enter the length of your credit history in years: ", -1, 99);
	private MoBettaScanner credLim = new MoBettaScanner("Please enter your total credit limit.", -1.0, 2000000000.0);
	Random r = new Random();
	
	private final UUID CUSTOMER_ID;
	
	final String HEX_ALPHABET = "abcdefABCDEF0123456789";
	final int NUM_IN_HEX = HEX_ALPHABET.length();
	private final String name;
	
	private CreditReport _cred;
	private ChexSystems _score;
	
	private int age;
	private int ChexSystemsScore = 0; //intialize to 0 indicating no prior history
	
	
	public Customer(){
		this.CUSTOMER_ID = new UUID(64,64);
		this.age = ageS.intGet();
		this.name = nameS.stringGet();
		if(this.age>17)
			this._cred = fillCredReport(this.age);
		this._score = new ChexSystems();
				
		}

	
	
	public UUID getUUID(){
		return this.CUSTOMER_ID;
	}
	public int getAge(){
		return this.age;}
	
	public String getName(){
		return this.name;}
	
	public int getChexSystemsScore(){
		return this._score.getScore();}
	
	public int getCreditScore(){
		return this._cred.getCreditScore();
	}
	
	private CreditReport fillCredReport(int tempAge){
		
		int age = tempAge;
		System.out.println("Since you are " + tempAge + " years old, you must provide some credit information.");
		double credLimit = credLim.doubleGet();
		double accountBalance = credBalance.doubleGet();
		int lenCredHistory = credHistory.intGet();
		int latePaymentsOnRecord = latePayments.intGet();
		int recentCredInquiries = credInquiries.intGet();
		
		CreditReport tempcr = new CreditReport(age, latePaymentsOnRecord, recentCredInquiries, credLimit,
				accountBalance, lenCredHistory);
		
		
		return tempcr;
		}


}
