class Loan
{
    int loanNo;
    double amount;
    double roi;
    Loan(int loanNo, double amount , double roi)
    {
        this.loanNo = loanNo;
        this.amount = amount;
        this.roi    = roi;
    }
    public void getLoanDetails()
    {
        System.out.println("Loan Number is : "+loanNo);
        System.out.println("Amount is : "+amount);
        System.out.println("Rate Of Intrust is : "+roi);
    }
}
public class PersonalLoan extends Loan{
    String name;
    String address;
    PersonalLoan()
    {
        
    }
    PersonalLoan(int loanNo , double amount, double roi, String name , String address)
    {

    }
    
}