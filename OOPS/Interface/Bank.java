
interface Bank {

    int limit = 4000;

    void roi();

    interface Loan {

        int loanLimit = 3000;

        void normalLoan();
    }
}
