//. Create a class Account with accountNumber, custName, balance and
//interest rate. create method calculateInterest() which will calculate interest
//and add to balance. create a method to displayAccountDetails()
class Account{
    int accountno;
    String custname;
    int balance;
    int intrestrate;
    int intrest;
    int total;

    public Account(int accountno, String custname,int balance,int intrestrate) {
    this.accountno=accountno;
    this.custname=custname;
    this.balance=balance;
    this.intrestrate=intrestrate;
    int intrest=(balance*intrestrate*12)/100;
    this.intrest=intrest;
    int total=balance+intrest;
    this.total=total;
    }

    public void display(){
        System.out.println(accountno+" "+custname+" "+balance+" "+intrestrate+" "+intrest+" "+total);
    }
}
public class c10 {
    public static void main(String[] args) {
       Account ac=new Account(1,"ab",40000,2);
       ac.display();
       Account a=new Account(2,"qw",6,9);
    a.display();}
}
