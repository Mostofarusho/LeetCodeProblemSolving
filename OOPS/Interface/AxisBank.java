
public class AxisBank implements Bank,Bank.Loan {

    public void roi() {
        System.out.println("Axis Bank Roi Is 9.8 and its withdraw limit is " + Bank.limit);

    }
    public void normalLoan(){
        System.out.println("Axis Bank Lone interest rate is 5% lowest amount of loan they give Is"+Loan.loanLimit);
    }

}
