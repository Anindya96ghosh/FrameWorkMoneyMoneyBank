//Entry Point to test working of the framework
public class EntryPoint {

	public static void main(String args[])
	{
		BankFactory mmBankFactory=new MMBankFactory();
		SavingAcc mmSavingAcc= mmBankFactory.getNewSavingAcc(101,"Anindya",5000,true);
		CurrentAcc mmCurrentAcc= mmBankFactory.getNewCurrentAcc(101,"Anindya",2000,10000);
		
		
		mmSavingAcc.withdraw(3000);
		System.out.println(mmSavingAcc);
		mmSavingAcc.withdraw(3000);
		System.out.println(mmSavingAcc);
		
		mmCurrentAcc.withdraw(8000);
		System.out.println(mmCurrentAcc);
		mmCurrentAcc.withdraw(8000);
		System.out.println(mmCurrentAcc);
		
		mmCurrentAcc.deposite(8000);
		System.out.println(mmCurrentAcc);
		
		mmCurrentAcc.withdraw(20000);
		System.out.println(mmCurrentAcc);
		
		SavingAcc mmSavingAcc2 = mmBankFactory.getNewSavingAcc(102,"Anindya",5000,false);
		mmSavingAcc2.withdraw(6000);
	}
}
