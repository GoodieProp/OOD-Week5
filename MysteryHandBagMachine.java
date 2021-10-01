import java.util.Random;
/**
 * @author Xavier Gonzalez
 * Class: Object Oriented Development
 * File: MysteryHandBagMachine.java
 * 
 * Holds constructor and functions
 * 
 */
public class MysteryHandBagMachine {
	// Initialized Variales
	Random rand = new Random();
	State soldOutState;
	State paymentNotGivenState;
	State paymentGivenState;
	State soldState;
	State randomWinnerState;
	
	// Initialized state to soldOutState
	State s = soldOutState;
	int count = 0;
	
	// Initialized Arrays for hand bag brands and types
	String[] brand = {"Dior", "Versace", "Balenciaga", "Gucci", "Louis Vuitton"};
	String[] types = {"Shoulder Bag", "Crossbody", "Satchel", "Backpack Purse", "Tote Bag"};
	
	// Constructor that takes in a number of hand bags in the parameters
	public MysteryHandBagMachine(int numHandBags) {
		soldOutState = new SoldOutState(this);
		paymentNotGivenState = new PaymentNotGivenState(this);
		paymentGivenState = new PaymentGivenState(this);
		soldState = new SoldState(this);
		randomWinnerState = new RandomWinnerState(this);
		
		// if numHandBags is greater than 0, it will change the state to paymentNotGiven
		this.count = numHandBags;
		if (numHandBags > 0) {
			s = paymentNotGivenState;
		}
	}
	
	// insert money function
	public void insertMoney() {
		s.insertMoney();
	}
	
	// eject money function
	public void ejectMoney() {
		s.ejectMoney();
	}
	
	// confirm purchase function
	public void confirmPurchase() {
		s.confirmPurchase();
		if (count > 0) {
			s.dispenseMysteryBag();
		}
	}
	
	// set state function
	void setState(State s) {
		this.s = s;
	}
	
	// release hand bag function
	void releaseHandBag() {
		System.out.println("Your Mystery Hand bag is dispensed.");
		int numBrand = rand.nextInt(brand.length);
		int numBag = rand.nextInt(types.length);
		System.out.println("You received a " + brand[numBrand] + " " + types[numBag] + ".");
		if (count > 0) {
			count -= 1;
		}
	}
	
	// gets count of hand bags
	int getCount() {
		return count;
	}
	
	// refill hand bag count function
	void refill(int count) {
		this.count += count;
		System.out.println("The owner of the Mystery Hand Bag machine came by and restocked. "
				+ "There is " + this.count + " new Mystery Hand Bags now.");
		s.magicallyRefill();
	}
	
	// get state function
	public State getState() {
		return s;
	}
	
	// get sold state function
	public State getSoldOutState() {
		return soldOutState;
	}
	
	// get payment not given state function
	public State getPaymentNotGivenState() {
		return paymentNotGivenState;
	}
	
	// get payment given state function
	public State getPaymentGivenState() {
		return paymentGivenState;
	}
	
	// get sold state function
	public State getSoldState() {
		return soldState;
	}
	
	// get random winner state function
	public State getRandomWinnerState() {
		return randomWinnerState;
	}
	
	// toString to display
	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("\nMystery Hand Bag, Inc");
		result.append("\nInventory: " + count + " hand bag");
		if (count != 1) {
			result.append("s");
		}
		result.append("\n");
		result.append("The Machine is " + s + "\n");
		return result.toString();
	}
}
