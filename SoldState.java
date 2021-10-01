/**
 * @author Xavier Gonzalez
 * Class: Object Oriented Development
 * File: SoldState.java
 * 
 */
public class SoldState implements State {
	MysteryHandBagMachine mhbm;

	public SoldState(MysteryHandBagMachine mhbm) {
		this.mhbm = mhbm;
	}

	public void insertMoney() {
		System.out.println("Let me give your Mystery HandBag first before inserting more money.");
	}

	public void ejectMoney() {
		System.out.println("No can do. I ate your money already.");
	}

	public void confirmPurchase() {
		System.out.println("I don't do 2-for-1 Mystery HandBags. That's the other machine next to me.");
	}

	public void dispenseMysteryBag() {
		mhbm.releaseHandBag();
		if (mhbm.getCount() > 0) {
			mhbm.setState(mhbm.getPaymentNotGivenState());
		} else {
			System.out.println("You bought the last one!");
			mhbm.setState(mhbm.getSoldOutState());
		}
	}

	public void magicallyRefill() {}
	
	public String toString() {
		return "sold out.";
	}
}
