import java.util.Random;
/**
 * @author Xavier Gonzalez
 * Class: Object Oriented Development
 * File: PaymentGivenState.java
 * 
 */
public class PaymentGivenState implements State {
	Random rWinner = new Random(System.currentTimeMillis());
	MysteryHandBagMachine mhbm;

	public PaymentGivenState(MysteryHandBagMachine mhbm) {
		this.mhbm = mhbm;
	}

	public void insertMoney() {
		System.out.println("I can't accept more money. But if you were able to, "
				+ "I will just take it without giving it back.");
	}

	public void ejectMoney() {
		System.out.println("Your money is returned....in coins.");
		mhbm.setState(mhbm.getPaymentNotGivenState());
	}

	public void confirmPurchase() {
		System.out.println("You have confirmed your purchase!");
		int winner = rWinner.nextInt(10);
		if ((winner == 0 ) && (mhbm.getCount() > 1)) {
			mhbm.setState(mhbm.getRandomWinnerState());
		} else {
			mhbm.setState(mhbm.getSoldState());
		}
	}

	public void dispenseMysteryBag() {
		System.out.println("Nothing has been dispensed.");
	}

	public void magicallyRefill() {}
	
	public String toString() {
		return "waiting.";
	}
}
