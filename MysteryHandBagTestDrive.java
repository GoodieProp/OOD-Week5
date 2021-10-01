/**
 * @author Xavier Gonzalez
 * Class: Object Oriented Development
 * File: MysteryHandBagTestDrive.java
 * 
 * Main driver class to run program
 * 
 */
public class MysteryHandBagTestDrive {

	public static void main(String[] args) {
		MysteryHandBagMachine mhbm = new MysteryHandBagMachine(4);
		
		System.out.println(mhbm);
		
		mhbm.insertMoney();
		mhbm.confirmPurchase();
		mhbm.insertMoney();
		mhbm.confirmPurchase();
		mhbm.ejectMoney();
		
		System.out.println(mhbm);
		
		mhbm.confirmPurchase();
		mhbm.insertMoney();
		mhbm.refill(2);
		mhbm.confirmPurchase();
		
		System.out.println(mhbm);
		
		mhbm.insertMoney();
		mhbm.ejectMoney();
		mhbm.ejectMoney();
		mhbm.insertMoney();
		System.out.println(mhbm);
		mhbm.insertMoney();
		mhbm.confirmPurchase();
		
		System.out.println(mhbm);
		
		mhbm.confirmPurchase();
		mhbm.insertMoney();
		mhbm.confirmPurchase();
		
		System.out.println(mhbm);
		
		mhbm.insertMoney();
		mhbm.confirmPurchase();
		mhbm.ejectMoney();
		
		System.out.println(mhbm);
	}

}
