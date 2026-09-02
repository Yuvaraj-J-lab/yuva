class BankAccount{
    private int Accountnumber;
    private String Accountholder;
    private double balance;

    BankAccount(int Accountnumber,String Accountholder,double balance){
        this.Accountnumber=Accountnumber;
        this.Accountholder=Accountholder;
        this.balance=balance;
    }
    int  getAccountnumber(){
        return Accountnumber;
    }

    String getAccountholder(){
        return Accountholder;
    }

    double getbalance(){
        return balance;
    }

    void deposit(double amount){
        if(amount>0){
            balance+=amount;
            System.out.println("deposited:"+amount);
        }
        else{
            System.out.println("INvalid withdrawal");
        }
    }
    void withdraw(double amount){
        if(amount>0 &&amount<=balance){
            balance-=amount;
            System.out.println("withdrawen:"+amount);
        }
        else{
            System.out.println("Invalid Withdrawal");
        }
    }
    void DisplayAccount(){
        System.out.println("Accountnumber:"+Accountnumber);
        System.out.println("Accountholder:"+Accountholder);
        System.out.println("Balance:"+balance);
    }

}
class SavingAccount extends BankAccount{
    private double intrestrate;
    SavingAccount(int Accountnumber,String Accountholder,double balance,double intrestrate){
        super(Accountnumber,Accountholder,balance);
        this.intrestrate=intrestrate;
    }
    double getintrestrate(){
        return intrestrate;
    }
    void DisplayAccount(){
        System.out.println("Accountnumber:"+getAccountnumber());
        System.out.println("Accountholder:"+getAccountholder());
        System.out.println("Balance:"+getbalance());
        System.out.println("intrestrate:"+getintrestrate());

    }
}
class Main{
    public static void main(String[]args){
        BankAccount account=new SavingAccount(101,"yuva",50000,5.5);
        account.DisplayAccount();
        System.out.println();
        account.deposit(2000);
        System.out.println("updated balance:"+account.getbalance());
        System.out.println();
        account.withdraw(1000);
        System.out.println("Updated balance:"+account.getbalance());
    }
}

