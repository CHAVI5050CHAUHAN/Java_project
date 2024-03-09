package Bank_Application;

import java.util.UUID;

public class HDFC implements BankInterface{

    private String accountNumber;
    private String password;
    public String name;
    private int balance;
    public static double rateOfIntrest;

    public HDFC(String password, String name, int balance, int rateOfIntrest, int accountNumber) {
        this.password = password;
        this.name = name;
        this.balance = balance;
        this.accountNumber = UUID.randomUUID().toString();



    }

    @Override
//    overriding should be happen in same package
    public int Bankbalance(String password) {
//        if sended password is matched with this password(local)
        if(password==this.password){
            return balance;
        }
        return -1;
    }

    @Override
    public int addMoney(int money) {
        balance = balance + money;

        return balance;
    }

    @Override
    public String withDrawMoney(int drawMoney, String password) {

        if(password==this.password){
            if(drawMoney>balance){
                return "Insufficient Balance";
            }
            else{
                balance = balance - drawMoney;

                return "Your available balance is "+balance;
            }
        }
        else{
            return "Wrong password";
        }


    }

    @Override
    public String newPassword(String oldpassword, String newpassword) {
//        this.password denotes current password
        if(this.password.equals(oldpassword)){
            this.password=newpassword;
            return "Password change successfully";
        }
        else{
            return "Wrong password";
        }
    }

    @Override
    public double calculateTotalIntrest(int year) {

        double intrest = balance*rateOfIntrest*year/100;
        return intrest;
    }
}
