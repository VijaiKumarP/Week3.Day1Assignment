package Week3.Day1;

public class HdfcBank extends BankInfo {

	public void deposit() {
		System.out.println("HdfcBank Class : Deposit ");		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HdfcBank objHdfcBank=new HdfcBank();
		objHdfcBank.fixed();
		objHdfcBank.saving();
		objHdfcBank.deposit();
	}

}
