package encapsulation;



class Account{

  private int balance;
  private int accountnum;
 
 public void setBalance(int x){    //Setter Method
 
 this.balance= x;
 
 }

 public int getBalance(){            //Getter Method
 
 return balance;
 
 }

public int getAccountnum() {
	return accountnum;
}

public void setAccountnum(int accountnum) {
	this.accountnum = accountnum;
}

}


class Employee {

public static void main (String args []){

Account act = new Account ();

//act.balance =10000;

act.setBalance(10000);
act.setAccountnum(2);


//System.out.print("Account Balance"+ act.balance);

System.out.println("Account Balance  " +  act.getBalance());
System.out.println("Account Number   "  +  act.getAccountnum());

}


}

