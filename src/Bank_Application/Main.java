package Bank_Application;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        SBI account01 = new SBI("123","hari",1000,8,9999);
        SBI account02 = new SBI("456","om",90000,10,888);

        HDFC account1 = new HDFC("678","babu",48888,2,00006);
        HDFC account2 = new HDFC("876","laddu",99999,2,001);



        int balance = account01.Bankbalance("23");
        System.out.println("Your bank balance is "+balance+"/-");


        String pass = account02.newPassword("456","000");
        System.out.println(pass);

        int bal = account02.Bankbalance("000");
        System.out.print(bal);


        System.out.printf("Create new Account in SBI");

        Scanner sc = new Scanner(System.in);

        String name = sc.next();
        System.out.printf("Enter balance : ");
        int initialBalance = sc.nextInt();

        System.out.printf("Enter password");
        String passs = sc.next();

        System.out.printf("Enter Intrest");
        int intrestt = sc.nextInt();

        System.out.printf("Enter Account number");
        int acc = sc.nextInt();

        System.out.printf("Enter year");
        int years = sc.nextInt();

        SBI sbinew = new SBI(passs,name,initialBalance,intrestt,acc);


    }
}