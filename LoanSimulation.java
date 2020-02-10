package assignment02;
import java.util.Arrays;

public class LoanSimulation {
    public static void main(String[] args) {
    	Loanee[] loanee = new Loanee[3];
        for(int i=0; i< loanee.length; i++){
        	loanee[i] = new Loanee(100);
          if (i == (loanee.length - 1)) {
        	  loanee[i] = new Loanee(110);
          }
        }
        int amt[] = {100, 100, 100};
        double ir[] = {0.0, 0.1, 0.1};
        int yrs [] = {10, 1, 1};
        boolean[] canpay = new boolean[3];
        for (int i=0; i< loanee.length; i++){
          canpay[i] =  loanee[i].canPayLoan((double)amt[i], ir[i], yrs[i]);
          System.out.println(Arrays.toString(canpay));
        }
   }
}
