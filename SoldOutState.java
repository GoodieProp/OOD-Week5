/**
 * @author Xavier Gonzalez
 * Class: Object Oriented Development
 * File: SoldOutState.java
 * 
 */
public class SoldOutState implements State {
	MysteryHandBagMachine mhbm;

	public SoldOutState(MysteryHandBagMachine mhbm) {
		this.mhbm = mhbm;
	}
	
	public void insertMoney() {
		System.out.println("Sorry can't let you do that, the machine is sold out. Next restock is in a couple months.");
	}

	public void ejectMoney() {
		System.out.println("Trying to be sneaky huh? You can't eject anything because you haven't inserted anything!");
	}

	public void confirmPurchase() {
		System.out.println("I'm surprised you got to the confirm purchase screen.");
	}

	public void dispenseMysteryBag() {
		System.out.println("I mean you can try to dispense for a bag, but it's not going to magically appear.");
	}

	public void magicallyRefill() {
		mhbm.setState(mhbm.getPaymentNotGivenState());
	}
	
	public String toString() {
		return "sold out. Go away.";
	}

}
