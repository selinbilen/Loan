package assignment02;

public class Question4 {

	public static void main(String[] args) {
		Loanee1[] loanees1 = new Loanee1[3];
		loanees1[0]=new Loanee1(300,"Selin");
		loanees1[1]=new Loanee1(240,"Lara");
		loanees1[2]=new Loanee1(160,"Eylul");

		System.out.println(loanees1[2].getName());

		loanees1[1].addMoney(50);
		System.out.println(loanees1[1].getMoney());

		System.out.println(loanees1[0].canPayLoan(100, 0.1, 1));

		System.out.println(loanees1[0].getLoanAmount());
	}

}
