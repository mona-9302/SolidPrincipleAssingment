    //applying oops concept using bank class

                                //class 
// class Bank{

//        int accountNumber;
//        String customerName;
//        String branchName;

//        public Bank(){
//        	System.out.println("bank constructor");
//        }

//        public Bank(int accountNumber,String customerName,String branchName){
//        	this.accountNumber = accountNumber;
//        	this.customerName = customerName;
//        	this.branchName = branchName;
//        }

//        public void display(){
//        	System.out.println(accountNumber+","+customerName+","+branchName);
//        }

// }

// class TestingClass{

// 	public static void main(String[] args) {
		
// 		Bank bank = new Bank(1068,"Monika","GPO");
// 		bank.display();
// 	}
// }

//PolyMorPhism - Method OverLoading

// class Account{

// 	public void payment(String username,String password){
// 		System.out.println("payment is getting through net banking");
// 	}

// 	public void payment(int cash){
// 		System.out.println("payment is getting through cash");
// 	}

// 	public static void main(String[] args) {
		
// 		Account account = new Account();
// 		account.payment("monika@1234","monika0000");
// 		account.payment(10000);

// 	}
// }

//Method Overrding

// class AccountUsingOverriding{

// 	public void payment(){
// 		System.out.println("payment is going on");
// 	}
// }

// class DebitCard extends Account{

// 	public void payment(){
// 		System.out.println("payment is getting through DebitCard");
// 	}
// }

// class CreditCard extends Account{

// 	public void payment(){

// 		System.out.println("payment is getting through Credit Card");
// 	}

// 	public static void main(String[] args) {
		
// 		 CreditCard credit = new CreditCard();
// 		 credit.payment();

// 		 DebitCard debit = new DebitCard();
// 		 debit.payment();
// 	}
// }

//Encapsulation

// class Bank{

// 	private int balance;

// 	public void setBalance(int balance){
// 		//I have applied validation if anyone will try to add invalid amount
// 		if(balance>0){
//             this.balance = balance;
// 		}else{
// 			System.out.println("invalid amount");
// 		}
		
// 	}

// 	public int getBalance(){
// 		return balance;
// 	}
// }

// class BankSolution{

// 	public static void main(String[] args) {
		
// 		Bank bank = new Bank();

// 		bank.setBalance(0);
// 		System.out.println(bank.getBalance());

// 		bank.setBalance(1000);
// 		System.out.println(bank.getBalance());
// 	}
// }


//---------------------------Abstraction---------------------------------------
	

