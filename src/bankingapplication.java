import java.util.Scanner;

public class bankingapplication {
	
	public static void main(String[] args) { 
		BankAccount obj1 = new BankAccount("vicky","Sbin0021");
		obj1.ShowMenu();
	}
	
}

 class BankAccount
 {
 int balance;
 int previoustransaction;
 String customerName;
 String customerId;
 
 BankAccount(String cname,String cid)
 {
	 customerName= cname;
	 customerId = cid;
 }
 
 void deposit (int amount) //1
 {
	 if(amount!=0) 
{
  balance = balance+amount;
  previoustransaction=amount;
}
 
 }
 
 void withdraw(int amount)  //2 
 {
	 if(amount!=0)
	 {
balance=balance-amount;

previoustransaction=-amount;
	 }
		 
	 }
 
 void getprevioustransaction()  //3
 {
	 if(previoustransaction>0)
{
  System.out.println("deposited"+previoustransaction);  
}
	 else if(previoustransaction<0)
{
		 System.out.println("withdraw:"+ Math.abs(previoustransaction));
}
	 
	 else
 {
		 
	 System.out.println("No transaction occured");
	 
 }
 } 
   void ShowMenu()
   {
	   
   
	   char option ='\0';
	   Scanner scanner = new Scanner (System.in);
	   
	   System.out.println("Welcome"+customerName);
	   System.out.println("yourIdis"+customerId);
	   System.out.println("A.CheckBalance");
	   System.out.println("B.Deposit");
	   System.out.println("c.withdraw");
	   System.out.println("D.previoustransaction");
	   System.out.println("E.Exit");
	   
	   do
	   {
		   System.out.println("Enter an option");
		   option=scanner.next().charAt(0);
		   switch(option)
		   {
		   
		   case 'A':
			System.out.println("Balance="+balance);
			
			break;
			
		   case'B':
			   System.out.println("Enter an amount to deposit:");
			   int amount =scanner.nextInt();
			   deposit(amount);
			   break;
			 
		   case 'C':
			   System.out.println("Enter an amount to withdraw");
			   int amount2=scanner.nextInt();
			   withdraw(amount2);
			   break;
			   
		   case 'D':
			   
			   getprevioustransaction();
			   
			   break;
			   
		   case'E':
			   
			   break;
			   
			   default:
				   
				   System.out.println("Invalid option! please try again ");
				   
				   break;
		   }
				   
		   }while (option!='E');
		   
		   System.out.println("Thank you using our service");
		   
		   
   }
 }
 
	 
		 
		 
		 
	 
 
		   
		   
		   
		   
		   
		   
		   
	   
		   
		   
		   
		   
		   
		   
		   
	   
		   
		   
		   
		   
		   
		      
	   
	   
   
	 
	 
 
	 
 
	 
	
 
 
 
 
 
	 
	 
 




