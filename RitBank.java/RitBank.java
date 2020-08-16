import java.util.*;
/**
 * 
 * @author Liu Zhuo
 *
 */
public class RitBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            String username=null;
            String accountType=null;
            int accountNumber=0;
            int accountBalance=0;
            int refund=0;
            int randomNum=0;
            boolean exe=true;
            randomNum=(int)(Math.random()*9000+1000);
            newAccount hp=new newAccount(username,accountType,accountNumber,accountBalance);
            
           
            /**
             * input the command for customer to choose the transactions
             */
 label1:           while(exe) {
            	System.out.println("Enter one of the following commands");
                System.out.println("1.open - open a new account");
                System.out.println("2.close - close an account");
                System.out.println("3.credit - credit an account");
                System.out.println("4.summary - display current bank accounts");
            	System.out.println("5.time - pass certain amount of time");
                System.out.println("6.exit - exit program");
                System.out.print("What do you want to do ?");
                Scanner hp2=new Scanner(System.in);
                int choice=hp2.nextInt();
                /**
                 * use switch clause to distinguish different commands
                 * there are 6 branches for the transaction
                 */
                switch(choice) {
                case 1:
                	System.out.println("What type of account ?");
                	System.out.println("0 - for savings");
                	System.out.println("1 - for checking");
                	System.out.println("2 - for credit card");
                	Scanner hp3=new Scanner(System.in);
                    int choice1=hp3.nextInt();
                    /**
                     * If customers choose the command of opening an account
                     * then there are three more branches
                     * such as for saving,checking and credit card services
                     */
                	switch(choice1){
                	case 0:
                		System.out.println("What is the customer¡¯s name ?");
                		Scanner hp1=new Scanner(System.in);
                        username=hp1.nextLine();
                        //System.out.println(username);
                		hp.openAccount(username, "saving", randomNum);
                		System.out.println("How much to deposit ?");
                		Scanner hp4=new Scanner(System.in);
                        int saveAmount=hp4.nextInt();
                        //System.out.println("saveAmount");
                        hp.deposit(saveAmount);
                        System.out.println("");
                        break;
                        /**
                         * open a checking account is much like opening a saving account
                         */
                	case 1:
                		System.out.println("What is the customer¡¯s name ?");
                		Scanner hp8=new Scanner(System.in);
                        username=hp8.nextLine();
                        hp.openAccount(username, "checking", randomNum);
                        System.out.println("How much to deposit ?");
                        Scanner hp9=new Scanner(System.in);
                        saveAmount=hp9.nextInt();
                        hp.deposit(saveAmount);
                        System.out.println("");
                        break;
                        /**
                         * the reason for opening a saving and checking account is deposit money
                         * the reason for the credit card is to consume money
                         */
                	case 2:
                		accountType="credit card";
                		System.out.println("What is the customer¡¯s name ?");
                		Scanner hp5=new Scanner(System.in);
                		username=hp5.nextLine();
                		//System.out.println(username);
                		System.out.println("What is the account number ?");
                		Scanner hp6=new Scanner(System.in);
                		accountNumber=hp6.nextInt();
                		//System.out.println(accountNumber);
                		System.out.println("How much ?");
                		Scanner hp7=new Scanner(System.in);
                		accountBalance=0-hp7.nextInt();
                		hp.owedMoney(username, accountType, accountNumber, accountBalance);
                		System.out.println("");
                		break;
                		/**
                		 * we must set the default 
                		 */
                	default:
                		break;
                	}
                System.out.println("");
                break;
                /**
                 * if customers want to close an account
                 * when they confirm this,
                 * all the money will be withdrawed from their account
                 */
                case 2:
                	System.out.println("What is the customer¡¯s name ?");
            		Scanner hp11=new Scanner(System.in);
                    username=hp11.nextLine();
                    int currentBalance=hp.withdraw();
                    System.out.println("current balance: "+currentBalance);
                    System.out.println("");
                    break;
                case 3:
                	System.out.println("Please choose number 1 service later");
                	System.out.println("");
                	break;
                	/**
                	 * the function of case4 is to print the information of customers
                	 * and this infomation should be private
                	 */
                case 4:
                	hp.summary();
                	System.out.println("");
                	break;
                	/**
                	 * the design for case5 is to calculate the interests of 
                	 * saving,checking and credit card
                	 */
                case 5:
                	System.out.println("How months should pass ? ");
                	System.out.println("saving or checking account customer press 3");
                	System.out.println("credit card cusomer press 1");
                	Scanner hp10=new Scanner(System.in);
            		int months=hp10.nextInt();
            		hp.interests(months);
            		System.out.println("");
            		break;
            		/**
            		 * to exit the RitBank system
            		 * using break label to accomplish the goal
            		 */
                case 6:
                	System.out.println("");
                	break label1;
                default:
                	System.out.println("");
                	break;
                	}
                }
            }
	}


