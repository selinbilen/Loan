package assignment02;

public class LoanUtility1 {



	 public static void putInDescendingOrder(LoanPackage[] loans) {
		 for(int i=0; i<loans.length-1;i++) {
			 for(int j=0;j<loans.length-i-1;j++) {
				 if(loans[j].compareTo(loans[j+1])>0 ) {
					 LoanPackage temp = loans[j];
					 loans[j] = loans[j+1];
					 loans[j+1] = temp;
				 }
			 }
		 }
		 for(int i=0;i<loans.length-1;i++) {
			 int j = indexOfFirstLargestAmountDue(i, loans);
			 if(i!=j) {
				 LoanPackage.exchangeFields(loans[i], loans[j]);
			 }
		 }
	 }
	 public static int indexOfFirstLargestAmountDue(int start, LoanPackage[] loans) {
		 int index = 0;
		 for(int i=1; i < loans.length-1; i++) {

			 if(loans[index].compareTo(loans[i])> 0) {
				 index = i;
			 }
		 }
		 return index;
	 }
	 public static int indexOfFirstLargestLoan(int start, Loanee1[] loans) {
		 int index = 0;
		 for(int i=1; i<loans.length ; i++) {
			 if(loans[index].getLoanAmount() > loans[i].getLoanAmount() ) {
				 index = i;
		 	}
		 }
		 return index;
	 }
	 public static void putInDescendingOrder(Loanee1[] loans) {
		 for(int i=0; i<loans.length-1;i++) {
			 for(int j=0;j<loans.length-i-1;j++) {
				 if(loans[j].getLoanAmount() >loans[j+1].getLoanAmount() ) {
					 Loanee1 temp = loans[j];
					 loans[j] = loans[j+1];
					 loans[j+1] = temp;
				 }
			 }
		 }
	 }
}
