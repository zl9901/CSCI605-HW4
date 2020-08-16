/**
 * the variables which are defined in class Account
 * there is no need to define them again in class newAccount
 * the number of methods in newAccount are more than methods in Account class
 */
public class newAccount extends Account {
         public newAccount(String n,String aT,int aN,int aB) {
        	name=n;
         	accType=aT;
         	accNum=aN;
         	accBalance=aB;
         }
         
         public void openAccount(String n,String aT,int aN) {
         	name=n;
         	accType=aT;
         	accNum=aN;
         	accBalance=0;
         }
         
         public void summary() {
        	 System.out.println("bank summary");
        	 System.out.println("Account Number : "+accNum);
        	 System.out.println("Account Type : "+accType);
        	 System.out.println("Customer Name :" +name);
             System.out.println("Account Balance :  $"+accBalance);
         }
         
         public void deposit(int money) {
        	 accBalance=money;
         }
         
         public int withdraw() {
        	 accBalance=0;
        	 return accBalance;
         }
         
         public void owedMoney(String n,String aT,int aN,int aB) {
        	 name=n;
          	 accType=aT;
          	 accNum=aN;
          	accBalance=aB;
         }
         
         public void interests(int mon) {
        	 if(mon==1) {
        		 double revenue=0.0;
        		 revenue=accBalance-5.50;
        		 System.out.println(name+" charged $5.50 in interest after 1 months. Account Balance is now $"+revenue);
        		 System.out.println("Credit Card bill sent to customer "+name+" for account number "+accNum+" in the amount of $"+revenue);
        		 revenue=revenue-5.50;
        		 System.out.println(name+" charged $5.50 in interest after 1 months. Account Balance is now $"+revenue);
        		 System.out.println("Credit Card bill sent to customer "+name+" for account number "+accNum+" in the amount of $"+revenue);
        		 revenue=revenue-5.50;
        		 System.out.println(name+" charged $5.50 in interest after 1 months. Account Balance is now $"+revenue);
        		 System.out.println("Credit Card bill sent to customer "+name+" for account number "+accNum+" in the amount of $"+revenue);
        	 }else {
        		 double revenue1=0.0;
        		 revenue1=accBalance+1.65;
        		 System.out.println(name+" earned $1.65 in interest after 3 months. Account Balance is now $"+revenue1);
        	 } 
         }
}
