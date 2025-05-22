
public class TestClient extends NGO implements NGO.fund{

    void info(Bank b,Bank.Loan l) {
        b.roi();
        l.normalLoan();
        
    }
    @Override
    void NGOLoanGiven(){
        System.out.println("NGO Also gives Loan");
    }
   public void NGOLoanTaken(){
        System.out.println("NGO Also Takes Loan");
    }


    public static void main(String[] args) {
        TestClient obj = new TestClient();
        obj.info(new AxisBank(),new AxisBank());
        obj.info(new SbiBank(),new SbiBank());
        obj.NGOLoanGiven();
        obj.NGOLoanTaken();
    }
}
