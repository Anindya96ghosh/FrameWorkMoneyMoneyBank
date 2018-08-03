
public abstract class CurrentAcc extends BankAcc{

	private final float creditLimit;

	public CurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
		super(accNo, accNm, accBal);
		this.creditLimit = creditLimit;
	}
	
	@Override
	abstract public void withdraw(float money);

	

	@Override
	public String toString() {
		return "CurrentAcc [creditLimit=" + creditLimit + ", toString()=" + super.toString() + "]";
	}

	public float getCreditLimit() {
		return creditLimit;
	}

	
	
}
