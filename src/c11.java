//Create a class Account with the attributes accountNo, custName,
//accountBalance and methods setAccountDetails() which set the values to these
//attributes.
//withdraw() which subtracts the given amount from the available balance
//deposit() which adds a given amount to the available balance and
//dispAccountDetails() which displays accountNo, custName,
//accountBalance.
//Create a class Main1 which contains the main() method to test the functionality of
//Account class.
class Account1{
    int accountno;
    String custname;
    int balance;
    int intrestrate;
    int intrest;
    int total;
    int withdrow;
    int total2;
    int deposit;
    int total3;


    public Account1(int accountno, String custname, int balance, int intrestrate,int withdrow,int deposit) {
        this.accountno=accountno;
        this.custname=custname;
        this.balance=balance;
        this.intrestrate=intrestrate;
        int intrest=(balance*intrestrate*12)/100;
        this.intrest=intrest;
        int total=balance+intrest;
        this.total=total;
        this.withdrow=withdrow;
        int total2=balance-withdrow;
        this.total2=total2;
        this.deposit=deposit;
        int total3=balance+deposit;
        this.total3=total3;

    }
    public void display(){
        System.out.println(accountno+" "+custname+" "+balance+" "+intrestrate+" "+intrest+" "+total+" "+total2+" "+total3
        );
    }}

public class c11 {
    public static void main(String[] args) {
        Account1 ac=new Account1(1,"ab",40000,2, 500,1000);
        ac.display();

}}

