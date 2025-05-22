
public class SbiBank implements Bank, Bank.Loan {

    public void roi() {
        System.out.println("SBI bank roi is 8.8 and its withdraw limit is " + Bank.limit);
    }

    public void normalLoan() {
        System.out.println("SBI Bank Lone interest rate is 5% lowest amount of loan they give Is" + Loan.loanLimit);
    }
}
