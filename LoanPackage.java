package assignment02;

/**
 * A class representing a loan
 */
public class LoanPackage {
    private double amount; // amount the loan is for
    private double interestRate; // rate the loan takes on interest
    private int numYears;
    private double finalAmountDue;

    /**
     * Construct a loan object given a loan amount
     * and an interest rate
     *
     * @param amt the amount of the loan
     * @param ir the interest rate
     */
    public LoanPackage(double amt, double ir,int years) {
        this.amount = amt;
        this.interestRate = ir;
        this.numYears = years;
        this.finalAmountDue = getAmountDue();
    }

    /**
     * Gets the amount the loan is for
     *
     * @return the amount of the loan
     */
    public double getAmount() {
        return amount;
    }

    /**
     * Gets the interest rate of the loan
     *
     * @return the interest rate of the loan
     */
    public double getInterestRate() {
        return interestRate;
    }

    /**
     * Return the amount to be paid back on the loan,
     * given a number of years that have passed
     *
     * @param years the amount of years that have passed
     * @return the amount due on the loan after `years` years have passed
     */
    public double getAmountDue() {

        return finalAmountDue;
    }

    public int getNumYears() {
    	return numYears;
    }
    public int compareTo(LoanPackage pkg) {
    	return Double.compare(finalAmountDue, pkg.finalAmountDue);
    }
    public static void exchangeFields(LoanPackage pkg1, LoanPackage pkg2) {
    	pkg1.amount = pkg1.amount + pkg2.amount;
    	pkg2.amount = pkg1.amount - pkg2.amount;
    	pkg1.amount = pkg1.amount - pkg2.amount;

    	pkg1.interestRate = pkg1.interestRate + pkg2.interestRate;
    	pkg2.interestRate = pkg1.interestRate - pkg2.interestRate;
    	pkg1.interestRate = pkg1.interestRate - pkg2.interestRate;

    	pkg1.numYears = pkg1.numYears + pkg2.numYears;
    	pkg2.numYears = pkg1.numYears - pkg2.numYears;
    	pkg1.numYears = pkg1.numYears - pkg2.numYears;

    	pkg1.finalAmountDue = pkg1.finalAmountDue + pkg2.finalAmountDue;
    	pkg2.finalAmountDue = pkg1.finalAmountDue - pkg2.finalAmountDue;
    	pkg1.finalAmountDue = pkg1.finalAmountDue - pkg2.finalAmountDue;
    }
}
