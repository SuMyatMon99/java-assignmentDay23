package Bank;
import java.util.Scanner;
public class ChildBranch extends Bank implements BankFunction{
	double totalAmount = 0;
	public ChildBranch(double amt) {
		// TODO Auto-generated constructor stub
		super(amt);
		this.totalAmount = amt;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double num;
		System.out.print("Enter amount : " );
		num = sc.nextDouble();
		
		ChildBranch cb = new ChildBranch(num);
		cb.increment(num);
		cb.decreasement(num);
	}

	@Override
	public void increment(double amt) {
		// TODO Auto-generated method stub
		totalAmount += amt;
		System.out.println("Your amount is : " + totalAmount);
	}

	@Override
	public void decreasement(double amt) {
		// TODO Auto-generated method stub
		totalAmount -=amt;
		System.out.println("Your amoutn is : " + totalAmount);
	}

}
