package Bank_Application;

public interface BankInterface {

    public int Bankbalance(String password);

    //    overriding should be happen in same package

    public int addMoney(int money);

    public String withDrawMoney(int money, String password);

    public String newPassword(String oldpassword, String newpassword);

    public double calculateTotalIntrest(int year);

/*
    Transfer money
    with in the same bank

 */
}
