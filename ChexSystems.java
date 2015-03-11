package BankApplication;

import java.util.Random;

public class ChexSystems {

	private Random r = new Random();
	final int CHEX_SYSTEMS_SCORE;
	
	public ChexSystems(){
		//ChexSystems score ranges from 100 to 899
		this.CHEX_SYSTEMS_SCORE = (r.nextInt()*899)+100;}
	
	public int getScore(){
		return this.CHEX_SYSTEMS_SCORE;}
	
}
