package assignment02;

import java.util.Arrays;

public class Question3 {
	public static void main(String[] args) {

		LoanPackage[] loans = new LoanPackage[3];

		loans[0] = new LoanPackage(100,5,2);
		loans[1] = new LoanPackage(112,3,6);
		loans[2] = new LoanPackage(123,4,8);
		loans[1].exchangeFields(loans[1], loans[0]);

		System.out.println(LoanUtility.indexOfFirstLargestAmountDue(0, loans));
		LoanUtility.putInDescendingOrder(loans);
		for(int i=0; i < loans.length; i++) {
			System.out.println(loans[i].toString());  //Couldn't figure out how to print the array...
		}
	}
}
