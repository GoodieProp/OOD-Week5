/**
 * @author Xavier Gonzalez
 * Class: Object Oriented Development
 * File: PaymentNotGivenState.java
 * 
 */
public class PaymentNotGivenState implements State {
	MysteryHandBagMachine mhbm;

	public PaymentNotGivenState(MysteryHandBagMachine mhbm) {
		this.mhbm = mhbm;
	}


	public void insertMoney() {
		System.out.println("You have found where to insert money. Good Job!");
		mhbm.setState(mhbm.getPaymentGivenState());
	}

	public void ejectMoney() {
		System.out.println("You need to insert money, before attempting to eject.");
	}

	public void confirmPurchase() {
		System.out.println("The confirm button is greyed out. You cannot confirm purchase.");
	}

	public void dispenseMysteryBag() {
		System.out.println("Pay first, then I'll dispense.");
	}

	public void magicallyRefill() {

	}
	
	public String toString() {
		return "waiting for the monies. It needs the exact amount of $1000.";
	}

}
