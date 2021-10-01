/**
 * @author Xavier Gonzalez
 * Class: Object Oriented Development
 * File: RandomWinnerState.java
 * 
 */
public class RandomWinnerState implements State {
	MysteryHandBagMachine mhbm;

	public RandomWinnerState(MysteryHandBagMachine mhbm) {
		this.mhbm = mhbm;
	}

	public void insertMoney() {
		System.out.println("Let me give your Mystery Hand Bag first before inserting more money.");
	}

	public void ejectMoney() {
		System.out.println("I'm serious. Let me give your Mysterby Hand Bag first.");
	}

	public void confirmPurchase() {
		System.out.println("Stop trying to confirm. You're not gonna get another one.");
	}

	public void dispenseMysteryBag() {
		mhbm.releaseHandBag();
		if (mhbm.getCount() == 0) {
			mhbm.setState(mhbm.getSoldOutState());
		} else {
			System.out.println("Woooooow Congratulations! You won!!! What you might ask? A second hand bag!");
			mhbm.releaseHandBag();
			if (mhbm.getCount() > 0) {
				mhbm.setState(mhbm.getPaymentNotGivenState());
			} else {
				System.out.println("All Hand bags have been sold.");
				mhbm.setState(mhbm.getSoldOutState());
			}
		}
	}

	public void magicallyRefill() {}
	
	public String toString() {
		return "dispensing two mysterious hand bags, because you passed the luck test!";
	}
}
